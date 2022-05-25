# 우분투 마리아db 방화벽 해제

1. OS : 우분투
2. 공유기 : IPTIME
3. DB : 마리아DB



    1. 마리아DB 방화벽 해제
        ```ubuntu
        <!-- ubuntu / mariaDB 방화벽 해제
        첫번째 것만 해도 방화벽이 열려서 가능했음 -->
        firewall-cmd --add-port=3306/tcp
        firewall-cmd --permanet --add-port=3306/tcp
        firewall-cmd --reload
        ```
       - 주의사항
         - 방화벽 해제 시 3306포트와 8080주소는 너무 범용적, 관례적으로 오랫동안 많이 사용되어왔기 때문에 무작위 대입 공격에 굉장히 취약하다.(1순위) 가능하면 다른 포트 주소를 사용하고 SSH 터널링을 사용하여 접속하는 방법을 추천한다.
         - 특히 3306 포트를 열고 host계정을 %,  bind-address=0.0.0.0은 정말 제 컴퓨터 털어주세요 하는 것과 같다. 




