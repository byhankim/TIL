## wsl2 gui 버전 실행을 위한 험난한 여정
1. win+R로 winver 띄우기 --> 1804로 업데이트가 산넘어산임을 간접적으로 예측함
2. 1904-1908-2004로 버전업 성공
3. wsl2 [공식문서](https://docs.microsoft.com/ko-kr/windows/wsl/install-win10#update-to-wsl-2)를 통해 다음 명령어 실행
```sh
  dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestart
```
4. 이후 파워쉘에서 ```wsl --set-default-version 2``` 명령어 실행시 BIOS 가상화 관련 에러메세지 출력
5. 재부팅하면서 BIOS 확인했으나 Intel Virtualization Support - Enabled, 가상화 지원 확인함
6. 손댄 설정 없이 재부팅하니 정상적으로 위의 명령어 사용 가능해짐
7. MS 스토어에서 Ubuntu 18.04 LTS 설치
8. installing... 뜨더니 0xc03a001a 에러메세지 출력 
```sh
  WslRegisterDistribution failed with error: 0xc03a001a
  Error: 0xc03a001a The requested operation could not be completed due to a virtual disk system limitation. 
  Virtual hard disk files must be uncompressed and unencrypted and must not be sparse.
  
  [해결법]
  C:\Users\사용자명\AppData\Local\Packages\CanonicalGroupLimited.Ubuntu18.04onWindows_79rhkp1fndgsc
  폴더를 우클릭하여  속성 - 일반 - 고급 - 압축 또는 암호화 속성 둘 다 해제(내용압축, 암호화)
```
9. 재시작후 다시 설치를 시도하였으나 0x80370109 에러메세지 확인
```sh
  WslRegisterDistribution failed with error: 0x80370109
  Error: 0x80370109 ??? ?? ???? ??? ??.
  
  [해결법]
  WIN+R -> services.msc
  LxssManager를 찾아 우클릭-재시작
  Right-click -> Restart
```
10. 설치 성공, new UNIX username까지 성공적으로 생성
11. 파워쉘에서 배포버전 wsl2로 설정
```sh
  wsl --l -v
  wsl --set-version <배포판 이름> <숫자 1 혹은 2를 입력하여 버전 지정>
  # 예) wsl --set-version Ubuntu-18.04 2
```
12. 내친 김에 MS store에서 Winsdows Terminal까지 설치! 프로필 설정도 [공식문서](https://docs.microsoft.com/ko-kr/windows/terminal/customize-settings/profile-settings)를 보면서 따라해보자!

