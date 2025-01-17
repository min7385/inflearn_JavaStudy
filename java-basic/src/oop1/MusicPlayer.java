package oop1;

// 캡슐화: 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것
// 캡슐화하면 내부 코드가 바뀌었을 때, 내부만 변경하면 됨. 외부는 수정할 필요 없음.
public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volumeUp(){
        volume++;
        volume++;
        System.out.println("음악 플레이어 볼륨 증가!!:" + volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨 감소~~:" + volume);
    }
    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
