#include <cs50.h>
#include <stdio.h>

int main(void)
{
    int height;
    do
    {
        height = get_int("Height: ");
    }
    while (height < 1 || height > 8);

    for (int no_brick = 1; no_brick < height + 1; no_brick++)
    {
        int total_dots = height - no_brick;
        for (int dot_ = 0; dot_ < total_dots; dot_++)
        {
            printf(" ");
        }
        for (int line = 0; line < no_brick; line++)
        {
            printf("#");
        }
        printf("\n");
    }
}
