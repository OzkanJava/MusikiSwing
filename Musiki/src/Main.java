import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		System.out.println(" ");
        System.out.println("                ___________      ______________      _____             _____         ");
        System.out.println("               /          /     /    _____    /     /    /            /    /         ");
        System.out.println("              /   _______/     /   /     /   /     /    /            /    /          ");
        System.out.println("             /   /____        /   /     /   /     /    /    ___     /    /           ");
        System.out.println("            /   _____/       /   /     /   /     /    /    /   \\   /    /           ");
        System.out.println("           /   /            /   /     /   /     /    /   /     \\  /    /            ");
        System.out.println("          /   /            /   /____ /   /     /     \\ /   /\\  \\ /    /           ");
        System.out.println("         /___/            /_____________/     /__________/   \\_______/         TECH ");
        System.out.println("                                                                                     ");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
