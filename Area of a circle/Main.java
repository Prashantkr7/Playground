#include<stdio.h>
int main()
{
  int di;
  float r, area;
  scanf("%d", &di);
  r =(float)di/2;
  area = 3.14*r*r;
  printf("%0.2f", area);
  return 0;
}