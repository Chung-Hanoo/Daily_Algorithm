const equals = (a, b) => JSON.stringify(a) === JSON.stringify(b); // 배열 내 값 동일 여부 판단
const saleListChange = (emoticonSale) => {
  let integer = Number(emoticonSale.join("")) - 1;
  integer = integer % 10 == 0 ? integer - 1 : integer;
  integer = [...integer.toString()].map((v) => Number(v));
  integer = integer.map((v) => {
    if (v == 9) return 4;
    else return Number(v);
  });
  return integer;
};

function solution(users, emoticons) {
  users.sort((a, b) => {
    if (a[0] != b[0]) return a[0] - b[0];
    else return a[1] - b[1];
  });
  emoticons.sort((a, b) => a - b); // 저렴순

  let maxSubscribe = 0; // 구독 가입자
  let maxRevenue = 0; // 최대 판매액
  let changingEmoticon = 0; // 할인율이 변환하는 이모티콘
  let emoticonSale = new Array(emoticons.length).fill(4); // 이모티콘 별 할인 (초기: 최대 할인)
  let emoticonSaleMin = new Array(emoticons.length).fill(1); // 이모티콘 별 최소 할인

  while (equals(emoticonSale, emoticonSaleMin) == false) {
    let subscribe = 0;
    let revenue = 0;

    // user 전체 탐색
    users.forEach((v) => {
      const [limitSale, limitSubscribe] = v;
      let eachSum = 0;

      // 이모티콘 별 할인율에 따라 구매 여부 판단
      emoticonSale.forEach((sale, index) => {
        if (limitSale / 10 <= sale)
          eachSum += (emoticons[index] * (10 - sale)) / 10;
      });
      if (limitSubscribe <= eachSum) subscribe++;
      else revenue += eachSum;
    });

    if (maxSubscribe < subscribe) {
      // 구독 서비스 인원 증가 시
      maxSubscribe = subscribe;
      maxRevenue = revenue;
    } else if (maxSubscribe == subscribe && maxRevenue < revenue) {
      //구독 서비스 인원은 같으나, 수익 증가 시
      maxRevenue = revenue;
    }
    emoticonSale = saleListChange(emoticonSale, changingEmoticon);
  }

  return [maxSubscribe, maxRevenue];
}