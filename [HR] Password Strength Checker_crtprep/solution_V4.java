            return 0;
        }
        
        boolean hasDigit = false;
        boolean hasCapital = false;
        
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ' || ch == '/') {
                return 0;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(ch)) {
                hasCapital = true;
            }
        }
        
        if (hasDigit && hasCapital) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(checkPassword(str, str.length()));