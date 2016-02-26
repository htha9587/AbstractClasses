package AbstractClasses;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import AbstractClasses.abstractClass;

public class abstractSubClass extends abstractClass
{
	public void abstractMethod()
	{
		System.out.println("First Abstract method.");
	}

	protected void processURLData(InputStream input) throws IOException
	{
		int data = input.read();
		while(data != -1)
		{
			System.out.println((char) data);
			data = input.read();
			URLProcessorIMPL urlProcessor;
			URLProcessorIMPL URLProcessorIMPL = urlProcessor = new URLProcessorIMPL();
			urlProcessor.process(new URL("https://github.com/htha9587"));
		}
	}
	
}
