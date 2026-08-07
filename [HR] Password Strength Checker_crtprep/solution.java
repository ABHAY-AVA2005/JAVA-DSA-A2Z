        
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
        boolean hasCapital = false;
        boolean hasDigit = false;
        
            return 0;
        }
        if (Character.isDigit(str.charAt(0))) {
        }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {