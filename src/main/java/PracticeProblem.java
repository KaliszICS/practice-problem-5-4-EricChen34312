interface Player{
	public void start();
	public void stop();
	public void volumeUp();
	public void volumeDown();
	public int getVolume();
}

class MusicPlayer implements Player {
	private boolean onOff;
	private String[] musicList;
	private String currentSong;
	private int volume;

	private int currentIndex;

	public MusicPlayer(String[] list){
		this.musicList = list;

		this.volume = 0;
		this.onOff = false;
		this.currentSong = "";
		this.currentIndex = 0;
	}

	public boolean getOnOff(){
		return this.onOff;
	}

	public void start(){
		this.onOff = true;
		this.currentSong = this.musicList[0];
	}

	public void stop(){
		this.onOff = false;
		this.currentSong = "";
	}

	public void volumeUp(){
		this.volume++;
	}

	public void volumeDown(){
		this.volume--;
	}

	public int getVolume(){
		return this.volume;
	}

	public void next(){
		this.currentIndex++;
		this.currentSong = musicList[currentIndex];
	}

	public void previous(){
		this.currentIndex--;
		this.currentSong = musicList[currentIndex];
	}

	public String getCurrentSong(){
		return this.currentSong;
	}
}

class RadioPlayer implements Player{
	private boolean onOff;
	private double[] stationList;
	private int volume;
	private double station;

	private int currentIndex;

	public RadioPlayer(double[] list){
		this.stationList = list;

		this.volume = 0;
		this.onOff = false;
		this.station = 0;
		this.currentIndex = 0;
	}

	public boolean getOnOff(){
		return this.onOff;
	}

	public void start(){
		this.onOff = true;
		this.station = this.stationList[0];
	}

	public void stop(){
		this.onOff = false;
		this.station = 0;
	}

	public void volumeUp(){
		this.volume += 2;
	}

	public void volumeDown(){
		this.volume -= 2;
	}

	public int getVolume(){
		return this.volume;
	}

	public void next(){
		this.currentIndex++;
		this.station = stationList[currentIndex];
	}

	public void previous(){
		this.currentIndex--;
		this.station = stationList[currentIndex];
	}

	public double getStation(){
		return this.station;
	}
}

class VideoPlayer implements Player{
	private boolean onOff;
	private String video;
	private int volume;
	private int currentTime;

	public VideoPlayer(String video){
		this.video = video;

		this.volume = 0;
		this.onOff = false;
		this.currentTime = 0;
	}

	public boolean getOnOff(){
		return this.onOff;
	}

	public void start(){
		this.onOff = true;
	}

	public void stop(){
		this.onOff = false;
	}

	public void volumeUp(){
		this.volume += 5;
	}

	public void volumeDown(){
		this.volume -= 5;
	}

	public int getVolume(){
		return this.volume;
	}

	public void fastForward(){
		this.currentTime += 5;
	}

	public void rewind(){
		this.currentTime -= 5;
	}

	public int getCurrentTime(){
		return this.currentTime;
	}
	public void setVideo(String video){
		this.video = video;
	}

	public String getVideo(){
		return this.video;
	}
}