#define HEX 0xFF
#define BIN 0b101
#define OCT 0o77

void main(void) {
    int x, y, i;

    if(!x > 0) {
        x = 0;
    }
    if(x > 0 && y < 10) {
        x = x + 1;
    } else {
        y = y - 1;
    }
    while(x < 100) {
        x = x + 1;
    }
    for(i = 0; i != 10; i = i + 1) {
        y = y + i;
    }
    switch(x) {
        case 0:
            y = 0;
        break;
        case 1:
            y = 1;
        break;
        case 2:
            y = 2;
        break;
        case 3:
            y = 3;
        break;
        default:
            y = -1;
    }
}
