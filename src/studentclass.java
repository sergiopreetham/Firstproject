public class studentclass {
    //functions
        int physics =56;
        int chemistry=68;
        int social =76;

        void percentage(){
            float percentage = physics+chemistry+social;
            System.out.println("calculate the percentage of the student = "+ percentage );
        }

        public static void main(String[] args) {
             studentclass preetham=new studentclass();
            System.out.println(preetham.physics);
            System.out.println(preetham.chemistry);
            System.out.println(preetham.social);
            preetham.percentage();
        }
    }

