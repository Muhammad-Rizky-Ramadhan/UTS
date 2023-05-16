class Form {
        public int[] angka;

        public Form(int[] numbers) {
            this.angka = numbers;
        }

        public boolean angkaSama() {
            for (int i = 0; i < angka.length; i++) {
                for (int j = i + 1; j < angka.length; j++) {
                    if (angka[i] == angka[j]) {
                        return true;
                    }
                }
            }
            return false;
        }
    }