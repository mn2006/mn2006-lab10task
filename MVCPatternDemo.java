import model.Employee;
import view.EmployeeView;
import controller.EmployeeController;

public class MVCPatternDemo {

    public static void main(String[] args) {

        Employee model = new Employee(1, "Mahmoud", "mahmoud@email.com");

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Ahmed");
        controller.setEmployeeEmail("ahmed@email.com");

        System.out.println("\nAfter Update:\n");

        controller.updateView();
    }
}