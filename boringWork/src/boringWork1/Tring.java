package boringWork1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Tring {
	
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("grouplist.txt");
		Scanner sc = new Scanner(f);
		HashMap hm = new HashMap();
		System.out.println(f.isAbsolute());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.isFile());
		System.out.println(f.exists());
		System.out.println(f.length());
		while(sc.hasNextLine()) {
			String key = sc.nextLine();
			ArrayList<String> al = new ArrayList<String>();
			for(int j = 0;j<3;j++) {
				al.add(sc.nextLine());
			}
			String s = al.toString();
			hm.put(key, s);
		}
		System.gc();
		boolean dF = false;
		dF = f.delete();
		System.out.println(hm);
		System.out.println(dF);
		System.out.println(f.isFile());
		System.out.println(f.delete());
		System.out.println(f.hashCode());
		System.out.println(f.toString());
		File file1=new File("woshizshicehisyxiaeryi\\zhengdebupianni");
		dF = file1.mkdirs();
		System.out.println(dF);
		
	}
	
	
}
