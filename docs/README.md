# 🚀 기능 목록

### 1. 게임 시작 및 컴퓨터 숫자 생성
   - 게임 시작 : "숫자 야구 게임을 시작합니다."
   - 컴퓨터의 랜덤 숫자 생성
     - `camp.nextstep.edu.missionutils`에서 제공하는 Randoms 및 Console API로 구현
     - Random 값 추출 : `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()` 활용

### 2. 숫자 입력받기 
   - "숫자를 입력해주세요 : "
   - 사용자 입력값 : `camp.nextstep.edu.missionutils.Console`의 `readLine()` 활용
     - 입력값 유효성 검사 수행

### 3. 유효성 검사
  - 서로 다른 3개 숫자 입력해야 한다.
    - 숫자가 3자리가 아닌 경우
    - 중복되는 수자가 존재하는 겨웅
    - 1-9까지의 숫자가 아닌 경우

### 4. 스트라이크 판별
  - 컴퓨터 생성값과 사용자 입력값이 같은 숫자이면서 동일한 위치에 존재하는 숫자의 개수 확인

### 5. 볼 판별
  - 컴퓨터 생성값과 사용자 입력값 중 같은 숫자이면서 다른 위치에 존재하는 숫자의 개수 확인

### 6. 결과 출력하기
  - 입력한 수에 대한 결과를 볼, 스트라이크 개수로 표시
  - 하나도 없는 경우 : "낫싱"
  - 3개 숫자를 모두 맞힐 경우 : 결과 출력 및 게임 종료

### 7. 게임 종료
  - 3 스트라이크가 아닌 경우 : 재입력 받기
  - 게임 종료 : "3개의 숫자를 모두 맞히셨습니다! 게임 종료"