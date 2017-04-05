load Byte.hdl,
output-file Byte.out,
compare-to Byte.cmp,
output-list in%D1.3.1 load%B3.1.3 out%D1.3.1;

set in 0,
set load 0,
eval,
output;

set in 255,
eval,
output;

set load 1,
eval,
output;

set in 127,
eval,
output;

set in 42,
eval,
output;

set in 255,
set load 0,
eval,
output;

set in 0,
set load 0,
eval,
output;
