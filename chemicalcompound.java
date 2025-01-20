import java.io.*;
class chemicalcompound
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void main()throws IOException
    {
      System.out.println("                                                    COMPOUND MAKER      1.0               ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("**************************************************************************************************************************** ");
      System.out.println("# 1......................START ");
      System.out.println("# 2......................HELP ");
      System.out.println("# 3......................ABOUT ");
      System.out.println("# 4......................EXIT ");
      int ch=Integer.parseInt(br.readLine());
      switch(ch)
      {
           case 1:valency();
                 break;
           case 2:fnhelp();
                 break;
           case 3:System.out.println("this is a free software meant for unlimited sharing ............. no rights reserved !!!!!!!!!!!!!!!!!"); 
                   System.out.println(" ");
           System.out.println("So.........would you like to try it out?press 1 to begin  and 2 to exit ");
            int ch2=Integer.parseInt(br.readLine());
              switch(ch2)
              {
                  case 1:main();
                            break;
                  case 2:System.exit(0);
                  default:System.out.println("Enter proper values!!!!!!!!!!!!");
                }
                 break;
           case 4:System.exit(0);
                 break;
          default:System.out.println("Please enter correct values");
        }
    }
    
    public void valency()throws IOException
    {
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Enter the Symbol of 1st element or radical");
        
            
        String a=br.readLine();
         System.out.println(" ");
          System.out.println(" ");
           System.out.println(" ");
            System.out.println(" ");
        int e1=0;
        int e2=0;
          
            if(a.equalsIgnoreCase("K")==true)
            e1=1;
                             
             else if (a.equalsIgnoreCase("Na")==true )
             e1=1;
                             
             else if (a.equalsIgnoreCase("Li")== true)
             e1=1;
                             
             else if (a.equalsIgnoreCase("NH3")== true)
             e1=1;
                              
             else if (a.equalsIgnoreCase("H")== true)
             e1=1;
                              
             else if (a.equalsIgnoreCase("Ca")== true)
             e1=2;
                             
               else if (a.equalsIgnoreCase("Mg")==true )
               e1=2;
                             
               else if (a.equalsIgnoreCase("Zn")==true )
               e1=2;
                             
              else if (a.equalsIgnoreCase( "Ba")==true)
              e1=2;
             else if (a.equalsIgnoreCase( "Ni")==true)
             e1=2;
                             
              else if (a.equalsIgnoreCase("Co")== true)
              e1=2;
                              
              else if (a.equalsIgnoreCase( "U")==true)
                             e1=2;
                              
             else if (a.equalsIgnoreCase("Cu")== true)
             {
             System.out.println("This element has variable valency = 1 , 2.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==1)
                        e1=1;
                        else if (x==2)
                        e1=2;
                         else
                        System.out.println("Ntr correct value");
                    }                
              else if (a.equalsIgnoreCase( "Ag")==true)
              {
              System.out.println("This element has variable valency = 1 , 2.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==1)
                        e1=1;
                        else if (x==2)
                        e1=2;
                         else
                        System.out.println("Ntr correct value");
                    }
             else if (a.equalsIgnoreCase( "Hg")==true)
             
             {
                 System.out.println("This element has variable valency = 1 , 2.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==1)
                        e1=1;
                        else if(x==2)
                        e1=2;
                         else
                        System.out.println("Ntr correct value");
                    }
              else if (a.equalsIgnoreCase( "Fe")==true)
              {
              System.out.println("This element has variable valency = 2 , 3.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e1=2;
                        else if (x==3)
                        e1=3;
                        else
                        System.out.println("Ntr correct value");
                    }              
             else if (a.equalsIgnoreCase( "Pb")==true)
             {
             System.out.println("This element has variable valency = 2 , 4.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e1=2;
                        else if (x==4)
                        e1=4;
                        else
                        System.out.println("Ntr correct value");
                    }            
             else if (a.equalsIgnoreCase( "Sn")==true)
             {
             System.out.println("This element has variable valency = 2 , 4.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e1=2;
                        else if (x==4)
                        e1=4;
                        else
                        System.out.println("Ntr correct value");
                    }
                    
              else if (a.equalsIgnoreCase("Pt")== true)
              {
              System.out.println("This element has variable valency = 2 , 4.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e1=2;
                        else if(x==4)
                        e1=4;
                        else
                        System.out.println("Ntr correct value");
                    }
             else if (a.equalsIgnoreCase("Mn")== true)
             {
             System.out.println("This element has variable valency = 2 , 4.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e1=2;
                        else if(x==4)
                        e1=4;
                        else
                        System.out.println("Ntr correct value");
                    }
              else if (a.equalsIgnoreCase( "Al")==true)
              e1=3;
                             
              else if (a.equalsIgnoreCase("Cr")== true)
              e1=3;
                             
             else if (a.equalsIgnoreCase("Au")== true)
             {
             System.out.println("This element has variable valency = 1 , 3.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==1)
                        e1=1;
                        else if (x==3)
                        e1=3;
                        else
                        System.out.println("Ntr correct value");
                    }
                    
           else if (a.equalsIgnoreCase("Cl")== true)
           e2=1;
                              
                              else if (a.equalsIgnoreCase("ClO3")== true )
                              e1=1;
                               
                              else if (a.equalsIgnoreCase("ClO")== true)
                              e1=1;
                               
                              else if (a.equalsIgnoreCase( "Br")== true)
                              e1=1;
                           
                              else if (a.equalsIgnoreCase( "I")== true)
                              e1=1;
                          
                              else if (a.equalsIgnoreCase("OH")== true)
                               e1=1;
                            
                              else if (a.equalsIgnoreCase("NO2")== true )
                              e1=1;
                             
                              else if (a.equalsIgnoreCase("NO3")== true )
                              e1=1;
                           
                              else if (a.equalsIgnoreCase( "HCO3")== true)
                              e1=1;
                            
                              else if (a.equalsIgnoreCase( "HSO3")== true)
                              e1=1;
                     
                              else if (a.equalsIgnoreCase("HSO4")== true )
                              e1=1;
                     
                              else if (a.equalsIgnoreCase("ALO2")== true)
                              e1=1;
                     
                               else if (a.equalsIgnoreCase("SO3")== true)
                               e1=2;
                            
                               else if (a.equalsIgnoreCase("SO4")== true )
                               e1=2;
                           
                               else if (a.equalsIgnoreCase( "S")== true)
                               e1=2;
                       
                               else if (a.equalsIgnoreCase("CO3")== true )
                               e1=2;
                            
                               else if (a.equalsIgnoreCase( "O")== true)
                               e1=2;
                            
                               else if (a.equalsIgnoreCase("CrO4")== true)
                               e1=2;
                            
                               else if (a.equalsIgnoreCase("Cr2O7")== true )
                               e1=2;
                             
                               else if (a.equalsIgnoreCase("O2")== true)
                               e1=2;
                    
                               else if (a.equalsIgnoreCase( "SiO3")== true)
                               e1=2;
                         
                               else if (a.equalsIgnoreCase("ZnO2")== true )
                               e1=2;
                           
                               else if (a.equalsIgnoreCase("PbO2")== true )
                               e1=2;
                           
                               else if (a.equalsIgnoreCase("PO4")== true)
                               e1=3;
                          
                               else if (a.equalsIgnoreCase( "N")== true)
                               e1=3;
                          
                               else if (a.equalsIgnoreCase("PO3")== true )
                               e1=3;
                         
                               else if (a.equalsIgnoreCase( "C")== true)
                               e1=4;
             else 
             {
             System.out.println("ntr proper values");     
             valency();
            }
        
        
        
        System.out.println("Enter the Symbol of 2nd element or radical");
       
        String b=br.readLine();
                   if(b.equalsIgnoreCase("K")==true)
            e2=1;
                             
             else if (b.equalsIgnoreCase("Na")==true )
             e2=1;
                             
             else if (b.equalsIgnoreCase("Li")== true)
             e2=1;
                             
             else if (b.equalsIgnoreCase("NH3")== true)
             e2=1;
                              
             else if (b.equalsIgnoreCase("H")== true)
             e2=1;
                              
             else if (b.equalsIgnoreCase("Ca")== true)
             e2=2;
                             
               else if (b.equalsIgnoreCase("Mg")==true )
               e2=2;
                             
               else if (b.equalsIgnoreCase("Zn")==true )
               e2=2;
                             
              else if (b.equalsIgnoreCase( "Ba")==true)
              e2=2;
             else if (b.equalsIgnoreCase( "Ni")==true)
             e2=2;
                             
              else if (b.equalsIgnoreCase("Co")== true)
              e2=2;
                              
              else if (b.equalsIgnoreCase( "U")==true)
                             e2=2;
                              
             else if (b.equalsIgnoreCase("Cu")== true)
             {
             System.out.println("This element has variable valency = 1 , 2.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==1)
                        e2=1;
                        else if (x==2)
                        e2=2;
                         else
                        System.out.println("Ntr correct value");
                    }                
              else if (b.equalsIgnoreCase( "Ag")==true)
              {
              System.out.println("This element has variable valency = 1 , 2.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==1)
                        e2=1;
                        else if (x==2)
                        e2=2;
                         else
                        System.out.println("Ntr correct value");
                    }
             else if (b.equalsIgnoreCase( "Hg")==true)
             
             {
                 System.out.println("This element has variable valency = 1 , 2.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==1)
                        e2=1;
                        else if(x==2)
                        e2=2;
                         else
                        System.out.println("Ntr correct value");
                    }
              else if (b.equalsIgnoreCase( "Fe")==true)
              {
              System.out.println("This element has variable valency = 2 , 3.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e2=2;
                        else if (x==3)
                        e2=3;
                        else
                        System.out.println("Ntr correct value");
                    }              
             else if (b.equalsIgnoreCase( "Pb")==true)
             {
             System.out.println("This element has variable valency = 2 , 4.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e2=2;
                        else if (x==4)
                        e2=4;
                        else
                        System.out.println("Ntr correct value");
                    }            
             else if (b.equalsIgnoreCase( "Sn")==true)
             {
             System.out.println("This element has variable valency = 2 , 4.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e2=2;
                        else if (x==4)
                        e2=4;
                        else
                        System.out.println("Ntr correct value");
                    }
                    
              else if (b.equalsIgnoreCase("Pt")== true)
              {
              System.out.println("This element has variable valency = 2 , 4.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e2=2;
                        else if(x==4)
                        e2=4;
                        else
                        System.out.println("Ntr correct value");
                    }
             else if (b.equalsIgnoreCase("Mn")== true)
             {
             System.out.println("This element has variable valency = 2 , 4.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==2)
                        e2=2;
                        else if(x==4)
                        e2=4;
                        else
                        System.out.println("Ntr correct value");
                    }
              else if (b.equalsIgnoreCase( "Al")==true)
              e2=3;
                             
              else if (b.equalsIgnoreCase("Cr")== true)
              e2=3;
                             
             else if (b.equalsIgnoreCase("Au")== true)
             {
             System.out.println("This element has variable valency = 1 , 3.With which would u like to proceed?please press the desired valency");
                        int x=Integer.parseInt(br.readLine());
                        if (x==1)
                        e2=1;
                        else if (x==3)
                        e2=3;
                        else
                        System.out.println("Ntr correct value");
                    }
        
           else if (b.equalsIgnoreCase("Cl")== true)
           e2=1;
                              
                              else if (b.equalsIgnoreCase("ClO3")== true )
                              e2=1;
                               
                              else if (b.equalsIgnoreCase("ClO")== true)
                              e2=1;
                               
                              else if (b.equalsIgnoreCase( "Br")== true)
                              e2=1;
                           
                              else if (b.equalsIgnoreCase( "I")== true)
                              e2=1;
                          
                              else if (b.equalsIgnoreCase("OH")== true)
                               e2=1;
                            
                              else if (b.equalsIgnoreCase("NO2")== true )
                              e2=1;
                             
                              else if (b.equalsIgnoreCase("NO3")== true )
                              e2=1;
                           
                              else if (b.equalsIgnoreCase( "HCO3")== true)
                              e2=1;
                            
                              else if (b.equalsIgnoreCase( "HSO3")== true)
                              e2=1;
                     
                              else if (b.equalsIgnoreCase("HSO4")== true )
                              e2=1;
                     
                              else if (b.equalsIgnoreCase("ALO2")== true)
                              e2=1;
                     
                               else if (b.equalsIgnoreCase("SO3")== true)
                               e2=2;
                            
                               else if (b.equalsIgnoreCase("SO4")== true )
                               e2=2;
                           
                               else if (b.equalsIgnoreCase( "S")== true)
                               e2=2;
                       
                               else if (b.equalsIgnoreCase("CO3")== true )
                               e2=2;
                            
                               else if (b.equalsIgnoreCase( "O")== true)
                               e2=2;
                            
                               else if (b.equalsIgnoreCase("CrO4")== true)
                               e2=2;
                            
                               else if (b.equalsIgnoreCase("Cr2O7")== true )
                               e2=2;
                             
                               else if (b.equalsIgnoreCase("O2")== true)
                               e2=2;
                    
                               else if (b.equalsIgnoreCase( "SiO3")== true)
                               e2=2;
                         
                               else if (b.equalsIgnoreCase("ZnO2")== true )
                               e2=2;
                           
                               else if (b.equalsIgnoreCase("PbO2")== true )
                               e2=2;
                           
                               else if (b.equalsIgnoreCase("PO4")== true)
                               e2=3;
                          
                               else if (b.equalsIgnoreCase( "N")== true)
                               e2=3;
                          
                               else if (b.equalsIgnoreCase("PO3")== true )
                               e2=3;
                         
                               else if (b.equalsIgnoreCase( "C")== true)
                               e2=4;
                               else
                               {
                                System.out.println("ntr correct values");
                                valency();
                            }
                    
          
      
       int h=e1,o=e2, i=0;
       for( i=1;i<=e1;i++)
        {
            if(e1%i==0 && e2%i==0)
            {
                h=h/i;
                o=o/i;
            }
            
        }
        if(o==1&&h==1)
        System.out.println("The compound is        : "+a+b);
        else if(o==1&&h!=1)
         System.out.println("The compound is        : "+a+b+" "+h);
         else if(o!=1&&h==1)
          System.out.println("The compound is        : "+a+" "+o+" "+b);
          else
           System.out.println("The compound is        : "+a+" "+o+" "+b+" "+h);
          System.out.println(""); 
           System.out.println("-------------------------------------------------------------------------------------------------------------------------------"); 
            System.out.println("Do you still want to continue???");
             System.out.println("****PRESS 1 TO EXIT****"); 
              System.out.println("****PRESS 2 FOR MAIN MENU****"); 
              int ch2=Integer.parseInt(br.readLine());
              switch(ch2)
              {
                  case 1:System.exit(0);
                            break;
                  case 2:main();
                  default:System.out.println("Enter proper values!!!!!!!!!!!!");
                }
    }
    public void fnhelp()throws IOException
    {
        System.out.println("This software helps to find the chemical formula of the compounds entered by u.");
        System.out.println("First step:enter the formula of a electro positive element for example if u want to enter Sodium , then enter Na");
        System.out.println("Second step:enter the formula of a electro negetive element for example if u want to enter Oxygen , then enter O");
        System.out.println(" ");
         System.out.println(" ");
          System.out.println(" ");
           System.out.println("So.........would you like to try it out?press 1 to begin  and 2 to exit ");
            int ch2=Integer.parseInt(br.readLine());
              switch(ch2)
              {
                  case 1:main();
                            break;
                  case 2:System.exit(0);
                  default:System.out.println("Enter proper values!!!!!!!!!!!!");
                }
    }
}


        
