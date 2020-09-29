function getShuffleNumbers(length) {
    let numbers = [];

    //for문으로 1~25까지의 수를 0번지부터 24번지까지 입력

    for (let i = 0; i < length; i++) {
        numbers.push(i + 1);
    }//for end

    //섞기
    for( let i=0; i<length; i++){
        //해당번지의 수를 임시저장
        let tmp = numbers[i];
        let idx=Math.floor(Math.random()*length);
        //랜덤한 번지수를 i 번지에 대입
        numbers[i] = numbers[idx];
        //랜덤한 번지수에 i 번지의 값을 대입
        numbers[idx] = tmp;
    }

    //1,2,3,4,5,6.......25
    return numbers;
}//getShuffleNumbers() end