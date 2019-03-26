package ie.dit;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
    public void settings()
    {
        size(800,800);
    }

   public void setup()
    {
        loadData();
    }

    public void loadData()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        
        for(int i = 0; i < table.getRowCount(); i++)
        {
            TableRow row = table.getRow(i);
            System.out.println(row.getString("Display Name"));
            System.out.println(row.getString("Hab?"));
        }
    }
}