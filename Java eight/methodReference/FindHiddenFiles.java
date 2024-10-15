package methodReference;

import java.io.File;
import java.io.FileFilter;

public class FindHiddenFiles {

	void anonyMethod()
	{
		System.out.println("****Using Anonymous Inner Class Method*****");
		File[] files=new File("D:\\Audios\\1 songs").listFiles(
				new FileFilter()
				{
				  public boolean accept(File file)
				  {
					  return file.isHidden();
				  }
				});
		for(File f:files)
		{
			System.out.println(f.getName());
		}
	}
    static void lamdaMethod()
    {
    	File[] files=new File("D:\\Audios\\1 songs").listFiles(
    			file->file.isHidden());
    	System.out.println("\n****Using Lambda Method*****");
    	for(File f:files)
    		System.out.println(f.getName());
    }
    static void methodRef()
    {
    	System.out.println("\n******Using Method Reference*******");
    	File[] files=new File("D:\\Audios\\1 songs").listFiles(File::isHidden);
    	for(File f:files)
    		System.out.println(f.getName());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FindHiddenFiles f=new FindHiddenFiles();
        f.anonyMethod();
        lamdaMethod();
        methodRef();
	}

}
