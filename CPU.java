import java.util.Scanner;

class CPU {
    private double price;


    public CPU(double price) {
        this.price = price;
    }

   
    public void displayPrice() {
        System.out.println("CPU Price: ₹" + price);
    }

   
    class Processor {
        private int cores;
        private String manufacturer;

       
        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

       
        public void displayProcessorInfo() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    
    static class RAM {
        private int memory;
        private String manufacturer;

       
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        
        public void displayRAMInfo() {
            System.out.println("RAM Memory: " + memory + "GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the price of the CPU in INR: ");
        double price = scanner.nextDouble();
        CPU cpu = new CPU(price);
        cpu.displayPrice();

       
        System.out.print("Enter the number of cores for the Processor: ");
        int cores = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the manufacturer of the Processor: ");
        String processorManufacturer = scanner.nextLine();
        CPU.Processor processor = cpu.new Processor(cores, processorManufacturer);
        processor.displayProcessorInfo();

       
        System.out.print("Enter the amount of memory (in GB) for the RAM: ");
        int memory = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the manufacturer of the RAM: ");
        String ramManufacturer = scanner.nextLine();
        CPU.RAM ram = new CPU.RAM(memory, ramManufacturer);
        ram.displayRAMInfo();

        
        scanner.close();
    }
}
