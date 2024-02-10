package clipService;

import java.io.File;

import javax.swing.DefaultListModel;

public class GetMusicList {
	public static DefaultListModel<String>  getList() {
        // Creates an array in which we will store the names of files and directories
        String[] pathnames;
        DefaultListModel<String> listem = new DefaultListModel<String>();
        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("src\\Musikiler");

        // Populates the array with names of files and directories
        pathnames = f.list();

        // For each pathname in the pathnames array
        for (String pathname : pathnames) {
            // Print the names of files and directories
            listem.addElement(pathname.toString().substring(0, pathname.toString().length()-4));
        }
        return listem;
    }
	
}


