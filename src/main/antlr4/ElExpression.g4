grammar ElExpression;

// 跳过空格回车和换行
WS : ([\r\n\t]|' ') -> skip;
// 单纯的字符
WORD: ([a-z]|[A-Z])+;
NUM: [0-9]+;
// 特殊符号
DOT: '.';
DQUOT: '"';
QUOT: '\'';
// 四则运算符
PLUS : '+';
REDC: '-';
MULT: '*'|'×';
DEV: '/'|'÷';
// El的起止符号
EVAL: '$';
BL: '{';
BR: '}';
// 中括号，可以表达对象的属性，map的值，数组的值
AL: '[';
AR: ']';
// 小括号
SL: '(';
SR: ')';
// 逻辑运算符
OR: '|';
AND: '&';
NOR: '!';
// 比较运算符
EQ: '==';
GT: '>';
GTEQ: '>=';
LT: '<';
LTEQ: '<=';
NOTEQ: '!=';

// True和False
TRUE: 'true';
FALSE: 'false';

//变量名规则
var: WORD(WORD|NUM)*;
// 变量单元规则，可以放在中括号里面的那些
varUnit: var
    | DQUOT var DQUOT
    | QUOT var QUOT;
// 数字类规则
nums: NUM|NUM(DOT NUM);
// 逻辑类规则
bool: TRUE|FALSE;
// 对象取值规则
arrayIndexed: AL nums AR;
objectProperty:  AL varUnit AR
                |DOT var;
objectVar:  var
           | var (objectProperty | arrayIndexed) +
           ;

// -------------------四则运算处理的部分-------------------
// 乘除法计算规则
// 基础运算表达式，可以有其他的【带括号的表达式或者是变量和数值之间的乘除操作构成】
// 这里和括号处理有递归的关系。
basicCalcuteExpr: basicWithScope (op = (MULT | DEV) basicWithScope ) *
                ;

// 加减法计算规则
// 一个基础的可运算表达式，由基础运算表达式的加减构成
calcutable: basicCalcuteExpr (op = (PLUS | REDC) basicCalcuteExpr) * ;
// 括号处理
basicWithScope: SL calcutable SR    // 左括号 + 可运算表达式 + 右括号
                | (nums | objectVar); // 直接的数值或变量

// ----------------四则运算规则结束---------------------

// ---------------逻辑运算的处理部分---------------
// 表达式比较
logicCompare: calcutable (op = EQ|GT|GTEQ|LT|LTEQ|NOTEQ) calcutable;

// 逻辑计算规则
logicalcutable: (logicExpr) (op=(OR | AND) (logicExpr)) *
            | NOR logicExpr;

//括号处理
logicExpr: bool | objectVar | logicCompare
           | SL logicalcutable SR;

//----------------逻辑运算规则结束------------------

// 解析点
evalable: calcutable | logicalcutable;

// 执行入口
evalablePart: EVAL BL evalable BR;

