# iTrust2



## Team2 iTrust2 Project
| GitLab ID | Name |Student ID|    Contact    | etc. |
|:---:|:---:|:---:|:-------------:|:---:|
| 2019145010 | Lim, Yewon | 2019145010 | 010-5446-2109 | Experienced in Java |
| KangMinYong | Kang, Minyong | 2017147513 | 010-3041-1621 | Experienced in Java |
| 2021147561 | Kim, Yeong Seo | 2021147561 | 010-9494-7646 | Experienced in Java |
| 2021147598 | Park, Seungho  | 2021147598 | 010-4076-6939 | Experienced in Java |
| claire | Kim, Jueun | 2021147510 | 010-7213-7394 | Experienced in Java |
| Yoon | Yoon, Jongyoon | 2021147599 | 010-8300-1365 | Experienced in Java |
| Soeun | Uhm, Soeun | 2019143073 | 010-9887-7683 | Experienced in Java |
| 2019145019| Jang, Yeonghwan | 2019145019 | 010-3103-3840 | Experienced in Java |
| 2021147593 | Noh, GyuMin | 2021147593 | 010-7141-2273 | Experienced in Java |

## Regular Meeting

11 PM, Tue, 1hour.  
Link: https://meet.google.com/ocp-naww-bnv

### 10/17 Team meeting
- Iteration 별 Leader 정하기
- Branch 관리 전략 
- 구현할 UC 정하기
- - -

### 10/24 Team meeting
- User Story 는 무엇인가 정의
- Team 별 UC 명세서 작성 
- - -

### 11/05 Cell2 meeting
![git-flow](img/git-flow.png){: width="900" height="800"}

**Git flow 방식 제안**
- [Git flow 참고 영상](https://youtu.be/EV3FZ3cWBp8)

**Commit Convention 제안**
- [Commit Convention 참고 자료](https://velog.io/@shin6403/Git-git-%EC%BB%A4%EB%B0%8B-%EC%BB%A8%EB%B2%A4%EC%85%98-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0)
```
# 제목은 최대 50글자까지 아래에 작성: ex) Feat: Add Key mapping  


# 본문은 아래에 작성  


# 꼬릿말은 아래에 작성: ex) Github issue #23  


# --- COMMIT END ---  
#   <타입> 리스트  
#   feat        : 기능 (새로운 기능)  
#   fix         : 버그 (버그 수정)  
#   refactor    : 리팩토링  
#   design      : CSS 등 사용자 UI 디자인 변경  
#   comment     : 필요한 주석 추가 및 변경  
#   style       : 스타일 (코드 형식, 세미콜론 추가: 비즈니스 로직에 변경 없음)  
#   docs        : 문서 수정 (문서 추가, 수정, 삭제, README)  
#   test        : 테스트 (테스트 코드 추가, 수정, 삭제: 비즈니스 로직에 변경 없음)  
#   chore       : 기타 변경사항 (빌드 스크립트 수정, assets, 패키지 매니저 등)  
#   init        : 초기 생성  
#   rename      : 파일 혹은 폴더명을 수정하거나 옮기는 작업만 한 경우  
#   remove      : 파일을 삭제하는 작업만 수행한 경우  
# ------------------  
#   제목 첫 글자를 대문자로  
#   제목은 명령문으로  
#   제목 끝에 마침표(.) 금지  
#   제목과 본문을 한 줄 띄워 분리하기  
#   본문은 "어떻게" 보다 "무엇을", "왜"를 설명한다.  
#   본문에 여러줄의 메시지를 작성할 땐 "-"로 구분  
# ------------------  
#   <꼬리말>  
#   필수가 아닌 optioanl  
#   Fixes        :이슈 수정중 (아직 해결되지 않은 경우)  
#   Resolves     : 이슈 해결했을 때 사용  
#   Ref          : 참고할 이슈가 있을 때 사용  
#   Related to   : 해당 커밋에 관련된 이슈번호 (아직 해결되지 않은 경우)  
#   ex) Fixes: #47 Related to: #32, #21 
```
**FE / BE 역할 분담 필요**
- FE: 3명
- BE & TestQA: 6명

**UC 19 관련 논의**
UC19는 식단일지 입출력이 필요함.
`데이터 주고받는 방법`에 대한 고민 필요
1. 환자 객체가 식단일지 저장
2. 환자 ID를 key로 DB에서 식단일지 저장
(2번이 효율적으로 판단됨)
- - -
