class CalculateMineralEssence {
    public static int calculateMineralEssence(String mineralBinary, boolean addScrub) {
        int numeroDecimal = Integer.parseInt(mineralBinary, 2);
        if (addScrub){
            numeroDecimal += 1;
        }
            
        return numeroDecimal;
    }
    public static void main(String[] args) {
        String mineralBinary = "1010";
        boolean addScrub = true;
        System.out.println(CalculateMineralEssence.calculateMineralEssence(mineralBinary,addScrub));
    }
}
