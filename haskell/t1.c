#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**

Antes de executar crie um arquivo logins.txt no mesmo diretório
do executável, um exemplo de entrada seria esta:

alex
alexrohleder
romualdo
ramiro
gerosvaldo

**/

void main(void)
{
    int i, j, k;

    char* login = malloc(sizeof(char) * 255);
    char* logins[255];

    for (i = 0; i < 255; i++) {
        logins[i] = malloc(sizeof(char) * 255);
    }

    i = 0, j = 0, k = 0;

    FILE* flogins = fopen("logins.txt", "r");

    if (flogins == NULL) {
        printf("Erro ao abrir os arquivos necessários."); return;
    }

    while (!feof(flogins)) {
        if (fscanf(flogins, "%s", login) <= 0) {
            break;
        }

        if (strlen(login) > 8) {
            continue;
        }

        login = strcat(login, "@mycompany.com");
        strcpy(logins[i], login);
        i++;
    }

    fclose(flogins);

    for (k = 0; k < i; k++) {
        for (j = k + 1; j < i; j++) {
            if (strcmp(logins[j], logins[k]) < 0) {
                strcpy(login, logins[k]);
                strcpy(logins[k], logins[j]);
                strcpy(logins[j], login);
            }
        }
    }

    for (k = 0; k < i; k++) {
        printf("%s\n", logins[k]);
    }

}
