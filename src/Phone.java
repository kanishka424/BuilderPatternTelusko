public class Phone {
    private String os;
    private int ram;
    private int processor;
    private int screen;
    private int battery;


    public Phone(String os, int ram, int processor, int screen, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screen = screen;
        this.battery = battery;
    }

    public String getOs() {
        return os;
    }


    public void setOS(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
