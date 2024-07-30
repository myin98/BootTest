USE docker;

INSERT INTO t1 (nm, age, gend) VALUES ('이름1', 10, 0);
INSERT INTO t1 (nm, age, gend) VALUES ('이름2', 15, 1);
INSERT INTO t1 (nm, age, gend) VALUES ('이름3', 12, 1);
INSERT INTO t1 (nm, age, gend) VALUES ('이름4', 19, 0);
INSERT INTO t1 (nm, age, gend) VALUES ('이름5', 21, 1);
INSERT INTO t1 (nm, age, gend) VALUES ('이름6', 24, 0);

COMMIT;
TRUNCATE TABLE t1;

SELECT * FROM t1;

DELETE FROM t1 WHERE nm = '홍길동'

ROLLBACK;

COMMIT;