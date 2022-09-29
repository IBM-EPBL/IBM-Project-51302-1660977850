import java.util.*:
calss customer
{
int serno,old,cur,usage;
double amount;
void main()
  {
     system.out.printin("enter the service number=");
     scanner s1=newscanner(system.in);
     serno=s1.next Int();
     system.out.println("enter the perivious month reading");
     old=s1.next Int();
     system.out.println("enter the cirrent month reading");
     cur=s.next Int();
     usage=cur-old;
     system.out.println("usage of unit"+usage);
   }
void display()
  {
     system.out.println({"service number"+serno);
     system.out.println("unit usage="+usage);
     systen.out.println("Bill amount="+amount)
  }
}
class domestic extend customer
{
  void billcalculated()
    {
    customer:read();
     if(usage<100)
      amount=0.0;
    else
      amount=(usage-100)*2.00
      customer:display();
     }
}
class commerial extend domestic
  {
   void billcalculated()
    {
      customer:read();
    if(usage<100)
      amount=usage&8.00;
    else 
      amount=usae*10.00;
      customer:display();
    }
}
class ebbill
  {
   public  static voiud main(String a[])
      {
        domestic c1=new domestic():
                 c1.billcalvculated;
        commerical c2=new commercial();
                 c2.billcalculated():
      }
}

                 

 
     
