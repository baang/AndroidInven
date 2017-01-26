### 20170126-1
>좀더 유심히 살펴본 결과 환경설정의 각 아이템들을 누를때 팝업을 못띄우는 버그가 존재하였다
>해당 이슈를 픽스

### 20170126
>디자인 팀에서 작업할 때 어플리케이션 실행 중지 오류가 발견되어 테스트겸 빌드를 해봤지만 이상 증세를 파악하지 못했다

### 20170122
>고객앱 클라이언트 데이터베이스 연동 작업 오프라인 기능 이용 가능하도록 구현

### 20170120
>클라이언트 데이터베이스를 연동하여 새로운 매장을 등록할 때의 매장 리스트를 조회하는 기능을 리펙토링 하였다

### 20170119
>디자인 파트 레이아웃 xml오류 수정 및 최소 -> 취소 오타 수정

### 20170118
>현우파트 데이터베이스 작업
>1.데이터베이스를 하나하나 2차원 배열을 살리는 방향으로 설계하여 집어 넣어줌 (코드참조)
>2.그렇게하여 가지고 있는 데이터베이스를 현우가 설계한 반복문을 통해서 리턴값으로 넘겨줌 

### 20170113
>클라이언트 데이터베이스의 값을 반환하는 코드 작성중

ex14) 서비스앱 제작
고객에게 제공할 앱에 대한 작업을 진행하였다
각종 여러가지 ui로 데이터를 출력할 수 있다

### 20170112-1
>아니 쓰지도 않는 변수를 왜 써놔서 날 헷깔리게 하는건데

### 20170112
>안드로이드 빌드 툴 버전 25.0.0 으로 다시 변경

### 20170108-1
>클라이언트 데이터베이스에 테스트용 데이터를 적용시켜 로드가 잘 되는지 테스트를 하였다

### 20170108
>클라이언트 데이터베이스 연동 준비중

### 20170107
>매장 삭제시 확인 다일로그를 띄어 주는 걸로 변경

### 20170106-1
>매장 삭제 레이아웃 텍스트값들 string.xml로 이전

### 20170106
>매장 선택 아이템 레이아웃 변경 후 디자이너 확인 요청

### 20161230
>매장 검색할 때 기본적인 매장 리스트가 보이지 않는 버그 픽스

### 20161230
>매장 추가 후 등록된 매장 리스트 화면에 추가된 매장을 보여줄 수 있도록 갱신하는 내용을 추가하였다

### 20161229-9
>원하는 매장 선택 기능 추가

### 20161229-8
>매장검색기능 추가

### 20161229-7
>등록한 매장 삭제기능 추가

### 20161229-6
>매장 삭제 중 intent로 값이 전달되지 않았던 문제를 픽스

### 20161229-5
>매장 삭제 기능 구현중

### 20161229-4
>가상의 데이터베이스와 연동하여 등록된 매장 리스트를 볼수 있으며, 그 매장에 대한 정보와 공지를 볼 수 있다

### 20161229-3
>매장 검색 부분에서 검색내용에 뭔가를 쓸때마다 발생한 이벤트를 잡아냈다
>확인 버튼을 준비중으로 변경
>토스트 메시지 삭제

### 20161229-2
>스탬프 사용 버튼을 고객이 실수로 눌러버리는 불상사를 방지하기 위한 잠금장치를 구현하였다

### 20161229-1
>공지를 눌렀을 때 해당 공지의 내용을 팝업에 로드해 출력하는 솔류션 추가

### 20161229
>새로운 레이아웃 아이디 이름들 변경

### 20161228-6
>공지사항 작업전 샘플 추가

### 20161228-5
>위도 경도 데이터가 넘어가지 않았던 이유는 getStringExtra함수가 Double형을 가져오지 않기때문이였다
>따라서 intent로 보낼때 string으로 변환하여 보냄으로써 문제를 해결했다

### 20161228-4
>지도 연동을 하였지만 좌표를 전달하는데 문제가 생겨 원하는 위치에 표시를 하지 못한다

### 20161228-3
>매장 정보탭에 추가적인 데이터를 전송할 수 있게끔 리펙토링 하였다
>레이아웃의 마음에 안들는 아이디 값을 변경하였다
>매장에 바로 전화할 수 있는 기능을 추가하였다
>전화 관련 보안 예외 처리를 하였다

### 20161228-2
>상점 추가 부분 널 에러

### 20161228-1
>인터넷 연결 체크 기능 추가

### 20161228
>고객 디바이스에서 gmail계정을 추출해 오고 안드로이드 버전에 따라서 권한 요청을 하는 것 까지 구현

### 20161226-4
>학원에서 작업하기 전 해야할 일을 oven에서 레이아웃 디자인한걸 토데로 주석을 약간 추가

### 20161226-3
>공지 예시 삭제, 햄버거 매뉴 이미지 비활성화

### 20161226-2
>테스트용 상점 한개 추가

### 20161226-1
>등록된 매장중 한가지를 선택하면 그 매장에대한 정보를 로드해서 각 레이아웃에 맞게 데이터를 전달한다

### 20161226
>리사이클뷰를 최대한 재활용하여 등록된 상점들의 리스트를 출력하는 솔류션을 구현하였다

### 20161225-9
>매장 공지를 출력하기 위해 구현한 리사이클뷰를 재사용하기 위해 리펙토링하는중

### 20161225-8
>매장 선택 레이아웃의 기본 표시 데이터 변경

### 20161225-7
>레이아웃 디폴트 표시 데이터 편집

### 20161225-6
>현제 나의 스탬프를 보는 화면에서 쿠폰<->스탬프를 전환하는 버튼 이벤트를 추가하였다

### 20161225-5
>셋팅 버튼을 누르면 스낵바가 뜨도록 추가하여 어디서 이벤트를 처리해야할 지 알 수 있게끔 해놨다

### 20161225-4
>처음으로 보여주는 탭 번호 변경, 등록된 상점 클릭하면 화면이동

### 20161225-3
>매장 선택화면에서 각 버튼 이벤트 추가

### 20161225-2
>공지리스트 변수 명 변경

### 20161225-1
>상점 리스트를 보는 레이아웃의 각 버튼이나 이미지뷰 등의 아이디를 유지보수 하기 쉬운 이름으로 변경하여 난독화를 줄였다

### 20161225
>메리크리스마스 ㅠㅜ

### 20161212
>ex13예제의 데이터베이스 이동 부분을 디버깅 시에는 무조건 새로운 데이터베이스 파일로 옮기도록 수정하였다

### 20161211-1
>팝업이 뜨면 자동으로 키보드가 뜨도록 수정하였다

### 20161211
>저장되어 있는 상점들중 찾으려는 상점에 대한 정보를 조금씩 쓸때마다 리스트에 비슷한걸 찾은 결과를 갱신해서 출력하는 솔류션 구현

### 20161210-3
>등록된 상점들 중 하나를 택해서 세부 정보를 볼때 해당 매점이 위치한 정보가 정상적으로 출력되도록 수정하였다

### 20161210-2
>사용자가 등록한 상점의 정보를 출력하는 ui에 지도를 작은 사이즈로 출력하도록 수정하였다
>지도를 불러오는데 문제가 있던 부분을 수정하였다. 앱이 작동하는 디바이스의 안드로이드 버전을 float로 저장한게 문제였다. 따라서 sdk버전을 int형으로 저장하도록 수정하였다
>fragment끼리 데이터를 주고 받기 위해 bundle을 사용했다

### 20161210-1
>테스트 데이터를 제공하는 클레스를 따로 만들어 어플리케이션이 정상작동하는지 테스트 하고 있다
>지도에 getMapAsync메소드가 널인 오류가 존재함을 발견했다

### 20161210
>신규 추가 팝업이 뜨며, 검색란에 뭐든 작성을 하면 그 이벤트를 잡아낼 수 있다
>갤럭시s2에 안드로이드 마쉬멜로를 포팅하여 기기에 직접 테스트를 할 수 있게 됬다

### 20161206-2
>google map을 연동하여 상점의 위치를 알려주는 예제를 구현하려 했으나 가상머신에 깔린 google play services 버전이 낮아 테스트할 수 없었다

### 20161206-1
>구글 맵을 연동하기 전 앱 도메인을 변경하기 위해 안드로이드 스튜디오의 기능을 사용하였는데 잘 작동하지 않아 새로운 프로젝트를 만들어 소스들을 다시 셋팅하였다

### 20161206
>깃허브에 올리기위해 작업한 내용이 담긴 디렉토리를 옮기는 명령어와 깃허브에서 받은 최신 데이터를 가져오는 명령어를 매번 치기가 귀찮아서 쉘스크립트를 추가로 구현하였다

>오늘 같이 모여서 알게 되었는데 나의 소스를 참고하는 팀원이 있어 주석을 약간 추가하였다. 또한 디자인파트에서 작업해준 내용을 토데로 상점의 정보를 나타내는 ui를 구현하기 위해 탭을 하나 더 추가하였다

### 20161204
>디자이너가 작업한 기본 ui틀에 따라 신규 매장 추가 버튼을 플롯팅 버튼에서 리스트뷰의 아이템으로 대체하였다

### 20161202
>앱 실행 로딩 화면을 출력과 사용자 정보 입력화면을 출력하는 예제를 추가로 구현하였다

### 20161201
>햄버거 매뉴에 해당 사용자의 정보가 뜨며, 등록된 상점의 스탬프 현황을 한줄에 5개씩 정렬하여 출력할 수 있다

### 20161130
>fragment ui를 각 탭마다 다른 ui를 뷰할 수 있도록 추가 구현하였다

ex13) SQLite 사용 예제

본 예제는 Mariadb에서 생성한 데이터베이스 파일을  SQLite의 .db파일을 안드로이드 프로젝트에 그데로 사용하는 예제이다.

필요한 준비물
  - Mariadb에서 모델링한 데이터베이스
  - 안드로이드 프로젝트

프로젝트 내용 요약:
  - SQLiteDatabaseControl패키지에서 데이터베이스 초기화 또는 불러오기 기능이 구현되어 있음
  - 메인 Class인 SQLiteManager에서 위의 패키지를 사용하는 방법에 대한 소스가 작성되어 있음
  - .db에 저장되어 있던 내용을 불러와서 로그에 출력함
=======
# 클라이언트 데이터베이스 모델링

## 작업내용

>mysql workbench로 모델링한 내용을 sqlite데이터베이스에 적용시켜 .db파일로 추출함
임베디드 기기인 안드로이드 디바이스에도 데이터베이스를 사용할 목적으로 제작함

## 사용한 툴
>phpmyadmin, db browser for sqlite, mysql workbench

## 파일 설명

CustomerDatabase:
- Log.txt 는 mariadb 기준의 sql문을 sqlite로 변환하면서 변경된 내용이 저장되어있음
- .mwb 는 workbench로 모델링한 파일
- .sql 는 phpmyadmin에서 데이터베이스에 적용된 쿼리 내용들
- .db 는 sqlite로 모델링된 파일

ShopkeeperDatabase:
- 위와 동일 찡긋
