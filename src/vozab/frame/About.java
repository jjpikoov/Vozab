package vozab.frame;

import javax.swing.JFrame;


public class About extends InfoView
{
	static String text = "Vozab 1.2\n\n"
			+ "Vozab - Simple java swing program to learn vocabulary.\n\n"
			+ "Written by Pawel Jankowski <jjpikoov@gmail.com>\n\n"
			+ "You can find code on \nhttps://github.com/jjpikoov/Vozab.git\n\n\n\n"
			
			+  "This program is free software: you can redistribute it and/or modify "
		    + "it under the terms of the GNU General Public License as published by "
		    + "the Free Software Foundation, either version 3 of the License, or "
		    + "(at your option) any later version.\n\n"

		    + "This program is distributed in the hope that it will be useful, "
		    + "but WITHOUT ANY WARRANTY; without even the implied warranty of "
		    + "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the "
		    + "GNU General Public License for more details.\n\n"

		    + "You should have received a copy of the GNU General Public License "
		    + "along with this program.  If not, see <http://www.gnu.org/licenses/>.";



	public About()
	{
		super("Vozab - About", 300, 300, text);
		super.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
