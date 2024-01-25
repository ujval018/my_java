class repeat{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int count=0;
            for (int j = i; j < args.length; j++) {
                if (args[i].equals(args[j])) {
                    count++;
                }
            }
            System.out.println(args[i]+" appeared " + count+ " times");
        }
    }

};