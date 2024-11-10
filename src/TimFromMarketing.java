public class TimFromMarketing {

    static class Badge {

        Integer id;
        String name;
        String departmentName;

        public Badge() {

        }

        public Badge(Integer id, String name, String departmentName) {
            this.id = id;
            this.name = name;
            this.departmentName = departmentName;
        }

        public static void print(Integer id, String name, String departmentName) {
            String formattedDepartment;

            if (departmentName == null) {
                formattedDepartment = "OWNER";
            } else {
                formattedDepartment = departmentName.toUpperCase();
            }

            if (id != null) {
                System.out.println("[" + id + "] - " + name + " - " + formattedDepartment);
            } else {
                System.out.println(name + " - " + formattedDepartment);
            }
        }

    }


    public static void main(String[] args) {

        Badge badge = new Badge();
        Badge.print(734, "Ernest Johnny Payne", "Strategic Communication");

        Badge.print(null, "Jane Johnson", "Procurement");

        Badge.print(254, "Charlotte Hale", null);

        Badge.print(null, "Charlotte Hale", null);

    }

}
