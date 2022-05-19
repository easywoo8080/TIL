# 커널

## 잠깐! 모놀리식 커널과 마이크로 커널
---
- 모놀리식 커널이 디바이스 드라이버를 포함하여 모든 코드가 한 덩어리로 된 단일 커널이라고 하는데 이 '덩어리'가 어느 정도 범위인가?

  - 기본적으로 VFS, System call, IPC, File System, Scheduler, Virtual Memory, Device Drivers, Dispatcher 등이 있다.
중요한 포인트는 모놀리식 커널은 하드웨어를 제어하는 것 이상으로 컴퓨터에 필요하다고 여기는 코드들이 구현된다는 것이다. 
  
