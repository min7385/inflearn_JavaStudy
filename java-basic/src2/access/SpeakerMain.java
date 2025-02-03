package access;

public class SpeakerMain {

	public static void main(String[] args) {
		Speaker speaker = new Speaker(90);
		speaker.showVolume();
		
		speaker.volumeUp();
		speaker.showVolume();
		
		speaker.volumeUp();
		speaker.showVolume();
		
		speaker.volumeDown();
		speaker.showVolume();
		
		// 필드에 직접 접근
//		System.out.println("volume 필드 직접 접근 수정");
//		speaker.volume = 200;
//		speaker.showVolume();
	}
}

// 접근 제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있음.
// 사용하는 이유는 스피커의 볼륨이 100이 넘으면 고장난다고 가정했을 때,
// 새로운 스피커 개발자가 볼륨을 200으로 수정할 수 있음. 결국 고장.
// 지금은 Speaker 클래스에서 필드를 private으로 변경해서 speaker.volume = 200;이 컴파일 오류남.
// 좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약을 제공하는 프로그램이다!