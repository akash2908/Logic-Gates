#include <iostream>
#include <stdio.h>

    int in_A;
    int in_B;
int and_gate(void);


int and_gate(void)
{
    printf("input Gate A, enter 1 or 0, enter 2 to end program ");
    scanf("%d",&in_A);
    printf("input Gate B, enter 1 or 0, enter 2 to end program ");

    scanf("%d",&in_B);
    if (in_A==2 || in_B==2)
    {
                   return 0;
    }


    if (in_A==1 && in_B==1)
         {
          printf("Output is logic one \n");
         }
         else
         {
          printf("Output is logic zerro \n");
         }
    system("PAUSE");
    and_gate();
}

int main (void)
{
   int choice;
  printf("Enter 1 to try the AND gate functions " );
 scanf("%d",&choice);

 if (choice ==1)
 {
     and_gate();
 }
      return 0;

}
