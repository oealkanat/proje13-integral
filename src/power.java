public class power {
        public String myPow(int deg) {
            String s;
            switch (deg) {
                case 0: s = "\u2070"; break;
                case 1: s = "\u00B9"; break; //"\u00B9"
                case 2: s = "\u00B2"; break;
                case 3: s = "\u00B3"; break;
                case 4: s = "\u2074"; break;
                case 5: s = "\u2075"; break;
                case 6: s = "\u2076"; break;
                case 7: s = "\u2077"; break;
                case 8: s = "\u2078"; break;
                case 9: s = "\u2079"; break;
                case 10: s = "\u00B9\u2070"; break;
                default: s = " "; break;
            }
            return s;
        }
}