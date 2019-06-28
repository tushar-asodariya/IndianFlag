class indian
{

/*

*@author - 7U5H4R4
*/

public static void main(String args[])
{

  System.out.println(" \033[5m\033[33mHAPPY\033[0m \033[5m\033[0m\033[5mINDEP\033[5m\033[94mEN\033[5m\033[0m\033[5mDENCE \033[5m\033[92mDAY\033[0m");
  System.out.println("");

  for(int j =0;j<5;j++)
  {
    for(int i=0;i<50;i++)
    {
      System.out.print("\033[5m\033[33m~\033[0m");
    }
    System.out.println("");
  }

  for(int j =0;j<5;j++)
  {
    for(int i=1;i<=50;i++)
    {

      if(j==0)
      {
        if(i==25 || i==24 || i==26)
        {

          System.out.print("\033[5m\033[94m~\033[0m");

        } 
        else
        {
          System.out.print("\033[5m\033[0m\033[5m~\033[0m");
        }
      }
      else if(j==1)
        {
          if(i==25 || i==24 || i==26 || i==23 || i==27)
          {

            System.out.print("\033[5m\033[94m~\033[0m");

          }
          else
          {
            System.out.print("\033[5m\033[0m\033[5m~\033[0m");
          }
        }
        else if(j==2)
        {
          if(i==25 || i==24 || i==26 || i==23 || i==27 || i==22 || i==28)
          {

            System.out.print("\033[5m\033[94m~\033[0m");

          }
          else
          {
            System.out.print("\033[5m\033[0m\033[5m~\033[0m");
          }
        }
        else if(j==3)
        {
          if(i==25 || i==24 || i==26 || i==23 || i==27)
          {

            System.out.print("\033[5m\033[94m~\033[0m");

          }
          else
          {
            System.out.print("\033[5m\033[0m\033[5m~\033[0m");
          }
        }
        else if(j==4)
        {
          if(i==25 || i==24 || i==26)
          {

            System.out.print("\033[5m\033[94m~\033[0m");

          } 
          else
          {
            System.out.print("\033[5m\033[0m\033[5m~\033[0m");
          }
        } 

      }
      System.out.println("");
    }

    for(int j =0;j<5;j++)
    {
      for(int i=0;i<50;i++)
      {
        System.out.print("\033[5m\033[92m~\033[0m");
      }
        System.out.println("");
    }
  }
}



