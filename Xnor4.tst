load Xnor4.hdl,
output-file Xnor4.out,
compare-to Xnor4.cmp,
output-list a%B1.4.1 b%B1.4.1 out%B1.4.1;

set a %B0000,
set b %B0000,
eval,
output;

set a %B0000,
set b %B1111,
eval,
output;

set a %B1111,
set b %B0000,
eval,
output;

set a %B1111,
set b %B1111,
eval,
output;

set a %B0101,
set b %B0101,
eval,
output;

set a %B1010,
set b %B0101,
eval,
output;

set a %B1001,
set b %B0101,
eval,
output;
