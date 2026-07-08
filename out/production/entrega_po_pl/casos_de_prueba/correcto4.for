PROGRAM opcional;
INTEGER , PARAMETER :: HEX = z'FF';
INTEGER , PARAMETER :: BIN = b'101';
INTEGER , PARAMETER :: OCT = o'77';
INTEGER :: x, y, i;
! IF simple con .NOT.
IF (.NOT. x > 0) x = 0;
! IF THEN ELSE con .AND.
IF (x > 0 .AND. y < 10) THEN
  x = x + 1;
ELSE
  y = y - 1;
ENDIF
! DO WHILE
DO WHILE (x < 100)
  x = x + 1;
ENDDO
! DO para
DO i = 0, 10, 1
  y = y + i;
ENDDO
! SELECT CASE con múltiples etiquetas y default
SELECT CASE (x)
  CASE (0)
    y = 0;
  CASE (1)
    y = 1;
  CASE (2)
    y = 2;
  CASE (3)
    y = 3;
  CASE DEFAULT
    y = -1;
END SELECT
END PROGRAM opcional