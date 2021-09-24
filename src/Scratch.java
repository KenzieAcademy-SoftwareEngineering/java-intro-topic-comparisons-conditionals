class Scratch {
    public static void main(String[] args) {
        String weather = "snowy";
        if (weather == "") {
            System.out.println("Entry is empty");
        }
        weather = weather.toLowerCase();
        switch (weather) {
            case "snowy":
                System.out.println("It's snowy!");
                break;
            case "sunny":
                System.out.println("It's SUNNY!");
                break;
            default:
                System.out.println("Weather unrecognized");

            // output "It's SUNNY!"
        }
    }
}