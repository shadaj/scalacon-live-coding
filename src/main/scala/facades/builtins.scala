package me.shadaj.scalapy
import me.shadaj.scalapy.py
package object stdlib extends me.shadaj.scalapy.py.StaticModule("builtins") {
@py.native trait OverflowError extends me.shadaj.scalapy.stdlib.ArithmeticError {

}

object OverflowError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("OverflowError")) with py.Object {

}
def chr(__i : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("chr")(__i).as[me.shadaj.scalapy.stdlib.str]
@py.native trait BufferError extends me.shadaj.scalapy.stdlib.Exception {

}

object BufferError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BufferError")) with py.Object {

}
@py.native trait NotImplementedError extends me.shadaj.scalapy.stdlib.RuntimeError {

}

object NotImplementedError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("NotImplementedError")) with py.Object {

}
/* TypeVarExpr:-1() */
def copyright(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("copyright")().as[me.shadaj.scalapy.py.None]
@py.native trait ImportError extends me.shadaj.scalapy.stdlib.Exception {
def path: /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("path").as[/* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any]
def name: /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("name").as[/* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any]

}

object ImportError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ImportError")) with py.Object {
/* attribute: path */
/* attribute: name */
def apply(args : me.shadaj.scalapy.stdlib.`object`, name : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], path : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.ImportError = as[me.shadaj.scalapy.py.Dynamic].applyNamed("args" -> args, "name" -> name, "path" -> path).as[me.shadaj.scalapy.stdlib.ImportError]
}
def format(__value : me.shadaj.scalapy.stdlib.`object`, __format_spec : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("format")(__value, __format_spec).as[me.shadaj.scalapy.stdlib.str]
def divmod[_N2 <: me.shadaj.scalapy.py.Any](__x : _N2, __y : _N2): /* Tuple[_N2`-1, _N2`-1] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("divmod")(__x, __y).as[/* Tuple[_N2`-1, _N2`-1] */ me.shadaj.scalapy.py.Any]
@py.native trait TabError extends me.shadaj.scalapy.stdlib.IndentationError {

}

object TabError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("TabError")) with py.Object {

}
/* <mypy.nodes.TypeAlias object at 0x7f8665d28ec0> */
@py.native trait ValueError extends me.shadaj.scalapy.stdlib.Exception {

}

object ValueError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ValueError")) with py.Object {

}
/* TypeVarExpr:-1() */
def any(__iterable : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.`object`]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("any")(__iterable).as[me.shadaj.scalapy.stdlib.bool]
@py.native trait SystemExit extends me.shadaj.scalapy.stdlib.BaseException {
def code: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("code").as[me.shadaj.scalapy.stdlib.int]
}

object SystemExit extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SystemExit")) with py.Object {
/* attribute: code */
}
def hex(__number : /* Union[builtins.int, builtins._SupportsIndex] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("hex")(__number).as[me.shadaj.scalapy.stdlib.str]
@py.native trait TimeoutError extends me.shadaj.scalapy.stdlib.OSError {

}

object TimeoutError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("TimeoutError")) with py.Object {

}
@py.native trait ChildProcessError extends me.shadaj.scalapy.stdlib.OSError {

}

object ChildProcessError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ChildProcessError")) with py.Object {

}
/* TypeVarExpr:-1() */
def issubclass(__cls : me.shadaj.scalapy.stdlib.`type`, __class_or_tuple : /* Union[builtins.type, builtins.tuple[Union[builtins.type, builtins.tuple[Any]]]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("issubclass")(__cls, __class_or_tuple).as[me.shadaj.scalapy.stdlib.bool]
@py.native trait EOFError extends me.shadaj.scalapy.stdlib.Exception {

}

object EOFError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("EOFError")) with py.Object {

}
/* TypeVarExpr:-1() */
@py.native trait AttributeError extends me.shadaj.scalapy.stdlib.Exception {

}

object AttributeError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("AttributeError")) with py.Object {

}
def NotImplemented: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("NotImplemented").as[me.shadaj.scalapy.py.Any]
@py.native trait KeyboardInterrupt extends me.shadaj.scalapy.stdlib.BaseException {

}

object KeyboardInterrupt extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("KeyboardInterrupt")) with py.Object {

}
/* cannot compute str */
@py.native trait DeprecationWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object DeprecationWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("DeprecationWarning")) with py.Object {

}
@py.native trait MemoryError extends me.shadaj.scalapy.stdlib.Exception {

}

object MemoryError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MemoryError")) with py.Object {

}
/* cannot compute str */
def reveal_locals: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("reveal_locals").as[me.shadaj.scalapy.py.Any]
@py.native trait float extends me.shadaj.scalapy.stdlib.`object` {
def -(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__sub__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def __rfloordiv__(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rfloordiv__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def __mod__(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mod__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def <=(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def __float__(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__float__")().as[me.shadaj.scalapy.stdlib.float]
def >(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__gt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def __pow__(x : me.shadaj.scalapy.stdlib.float, mod : me.shadaj.scalapy.py.None = null.asInstanceOf[me.shadaj.scalapy.py.None]): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__pow__")("x" -> x, "mod" -> mod).as[me.shadaj.scalapy.stdlib.float]
def __rmul__(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def /(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__truediv__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def __rpow__(x : me.shadaj.scalapy.stdlib.float, mod : me.shadaj.scalapy.py.None = null.asInstanceOf[me.shadaj.scalapy.py.None]): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rpow__")("x" -> x, "mod" -> mod).as[me.shadaj.scalapy.stdlib.float]
def __floordiv__(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__floordiv__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def __radd__(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__radd__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def __getnewargs__(): /* Tuple[builtins.float] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getnewargs__")().as[/* Tuple[builtins.float] */ me.shadaj.scalapy.py.Any]
def hex(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("hex")().as[me.shadaj.scalapy.stdlib.str]
/* skip override: __eq__ */
/* skip override: __str__ */
def __bool__(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__bool__")().as[me.shadaj.scalapy.stdlib.bool]
/* member: real */
def as_integer_ratio(): /* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("as_integer_ratio")().as[/* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any]
def __int__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__int__")().as[me.shadaj.scalapy.stdlib.int]
def conjugate(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("conjugate")().as[me.shadaj.scalapy.stdlib.float]
def is_integer(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_integer")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __ne__ */
def <(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def __rmod__(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmod__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
/* member: fromhex */
def __rtruediv__(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rtruediv__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def *(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def __neg__(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__neg__")().as[me.shadaj.scalapy.stdlib.float]

def __rdivmod__(x : me.shadaj.scalapy.stdlib.float): /* Tuple[builtins.float, builtins.float] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rdivmod__")("x" -> x).as[/* Tuple[builtins.float, builtins.float] */ me.shadaj.scalapy.py.Any]
def __abs__(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__abs__")().as[me.shadaj.scalapy.stdlib.float]
def __pos__(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__pos__")().as[me.shadaj.scalapy.stdlib.float]
def __divmod__(x : me.shadaj.scalapy.stdlib.float): /* Tuple[builtins.float, builtins.float] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__divmod__")("x" -> x).as[/* Tuple[builtins.float, builtins.float] */ me.shadaj.scalapy.py.Any]
def >=(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def __round__(ndigits : me.shadaj.scalapy.py.None = null.asInstanceOf[me.shadaj.scalapy.py.None]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__round__")("ndigits" -> ndigits).as[me.shadaj.scalapy.stdlib.int]
def __round__(ndigits : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__round__")("ndigits" -> ndigits).as[me.shadaj.scalapy.stdlib.float]
/* member: imag */
def +(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def __trunc__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__trunc__")().as[me.shadaj.scalapy.stdlib.int]
/* skip override: __hash__ */
def __rsub__(x : me.shadaj.scalapy.stdlib.float): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rsub__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
}

object float extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("float")) with py.Object {

















/* member: real */







/* member: fromhex */



def apply(x : /* Union[typing.SupportsFloat, builtins._SupportsIndex, builtins.str, builtins.bytes, builtins.bytearray] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyNamed("x" -> x).as[me.shadaj.scalapy.stdlib.float]






/* member: imag */




}
@py.native trait FutureWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object FutureWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FutureWarning")) with py.Object {

}
def repr(__obj : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("repr")(__obj).as[me.shadaj.scalapy.stdlib.str]
@py.native trait PendingDeprecationWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object PendingDeprecationWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("PendingDeprecationWarning")) with py.Object {

}
@py.native trait ellipsis extends me.shadaj.scalapy.stdlib.`object` {

}

object ellipsis extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ellipsis")) with py.Object {

}
/* TypeVarExpr:-1() */
def oct(__number : /* Union[builtins.int, builtins._SupportsIndex] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("oct")(__number).as[me.shadaj.scalapy.stdlib.str]
@py.native trait Warning extends me.shadaj.scalapy.stdlib.Exception {

}

object Warning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Warning")) with py.Object {

}
def vars(__object : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("vars")(__object).as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
def all(__iterable : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.`object`]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("all")(__iterable).as[me.shadaj.scalapy.stdlib.bool]
/* <mypy.nodes.TypeAlias object at 0x7f86657d85c0> */
def hasattr(__obj : me.shadaj.scalapy.py.Any, __name : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("hasattr")(__obj, __name).as[me.shadaj.scalapy.stdlib.bool]
def True: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("True").as[me.shadaj.scalapy.stdlib.bool]
def False: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("False").as[me.shadaj.scalapy.stdlib.bool]
def locals(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("locals")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
@py.native trait _SupportsIndex extends me.shadaj.scalapy.stdlib.`object` {
def __index__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__index__")().as[me.shadaj.scalapy.stdlib.int]
}

object _SupportsIndex extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_SupportsIndex")) with py.Object {

}
def print(values : me.shadaj.scalapy.stdlib.`object`, sep : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any, end : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any, file : /* Union[builtins._Writer, None] */ me.shadaj.scalapy.py.Any, flush : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("print")(values, sep, end, file, flush).as[me.shadaj.scalapy.py.None]
def Ellipsis: me.shadaj.scalapy.stdlib.ellipsis = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Ellipsis").as[me.shadaj.scalapy.stdlib.ellipsis]
@py.native trait frozenset[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.AbstractSet[_T_co] {
/* skip override: __str__ */
/* skip override: __contains__ */
def union(s : me.shadaj.scalapy.typing.Iterable[_T_co])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.frozenset[_T_co]]): me.shadaj.scalapy.stdlib.frozenset[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("union")("s" -> s).as[me.shadaj.scalapy.stdlib.frozenset[_T_co]]
def symmetric_difference(s : me.shadaj.scalapy.typing.Iterable[_T_co])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.frozenset[_T_co]]): me.shadaj.scalapy.stdlib.frozenset[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("symmetric_difference")("s" -> s).as[me.shadaj.scalapy.stdlib.frozenset[_T_co]]
def intersection(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.`object`])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.frozenset[_T_co]]): me.shadaj.scalapy.stdlib.frozenset[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("intersection")("s" -> s).as[me.shadaj.scalapy.stdlib.frozenset[_T_co]]
def issubset(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.`object`]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("issubset")("s" -> s).as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __iter__ */

/* skip override: __le__ */
/* skip override: __or__ */
/* skip override: __len__ */
/* skip override: __gt__ */
def issuperset(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.`object`]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("issuperset")("s" -> s).as[me.shadaj.scalapy.stdlib.bool]
/* skip override: isdisjoint */
def copy()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.frozenset[_T_co]]): me.shadaj.scalapy.stdlib.frozenset[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("copy")().as[me.shadaj.scalapy.stdlib.frozenset[_T_co]]
def difference(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.`object`])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.frozenset[_T_co]]): me.shadaj.scalapy.stdlib.frozenset[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("difference")("s" -> s).as[me.shadaj.scalapy.stdlib.frozenset[_T_co]]
/* skip override: __ge__ */
/* skip override: __and__ */
/* skip override: __sub__ */
/* skip override: __xor__ */
/* skip override: __lt__ */
}

object frozenset extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("frozenset")) with py.Object {







def apply[_T_co <: me.shadaj.scalapy.py.Any](iterable : me.shadaj.scalapy.typing.Iterable[_T_co] = null.asInstanceOf[me.shadaj.scalapy.typing.Iterable[_T_co]]): me.shadaj.scalapy.stdlib.frozenset[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyNamed("iterable" -> iterable).as[me.shadaj.scalapy.stdlib.frozenset[_T_co]]













}
@py.native trait UnicodeEncodeError extends me.shadaj.scalapy.stdlib.UnicodeError {
def `object`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("object").as[me.shadaj.scalapy.stdlib.str]
def end: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("end").as[me.shadaj.scalapy.stdlib.int]
def start: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("start").as[me.shadaj.scalapy.stdlib.int]
def encoding: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("encoding").as[me.shadaj.scalapy.stdlib.str]
def reason: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("reason").as[me.shadaj.scalapy.stdlib.str]

}

object UnicodeEncodeError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("UnicodeEncodeError")) with py.Object {
/* attribute: object */
/* attribute: end */
/* attribute: start */
/* attribute: encoding */
/* attribute: reason */
def apply(__encoding : me.shadaj.scalapy.stdlib.str, __object : me.shadaj.scalapy.stdlib.str, __start : me.shadaj.scalapy.stdlib.int, __end : me.shadaj.scalapy.stdlib.int, __reason : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.UnicodeEncodeError = as[me.shadaj.scalapy.py.Dynamic].applyNamed("__encoding" -> __encoding, "__object" -> __object, "__start" -> __start, "__end" -> __end, "__reason" -> __reason).as[me.shadaj.scalapy.stdlib.UnicodeEncodeError]
}
@py.native trait set[_T <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.MutableSet[_T] {
/* skip override: __str__ */
/* skip override: __contains__ */
/* skip override: clear */
/* skip override: discard */
/* skip override: __iter__ */

/* skip override: __or__ */
/* skip override: __len__ */
/* skip override: remove */
/* skip override: __gt__ */
def issuperset(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("issuperset")("s" -> s).as[me.shadaj.scalapy.stdlib.bool]
def copy()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.set[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("copy")().as[me.shadaj.scalapy.stdlib.set[_T]]
/* skip override: __iand__ */
def update(s : me.shadaj.scalapy.typing.Iterable[_T]): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("update")("s" -> s).as[me.shadaj.scalapy.py.None]
/* skip override: __ge__ */
/* skip override: __hash__ */
/* skip override: __and__ */
/* skip override: __sub__ */
def union(s : me.shadaj.scalapy.typing.Iterable[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.set[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("union")("s" -> s).as[me.shadaj.scalapy.stdlib.set[_T]]
def difference_update(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("difference_update")("s" -> s).as[me.shadaj.scalapy.py.None]
def intersection_update(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("intersection_update")("s" -> s).as[me.shadaj.scalapy.py.None]
/* skip override: pop */
def symmetric_difference(s : me.shadaj.scalapy.typing.Iterable[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.set[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("symmetric_difference")("s" -> s).as[me.shadaj.scalapy.stdlib.set[_T]]
def symmetric_difference_update(s : me.shadaj.scalapy.typing.Iterable[_T]): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("symmetric_difference_update")("s" -> s).as[me.shadaj.scalapy.py.None]
def intersection(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.py.Any])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.set[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("intersection")("s" -> s).as[me.shadaj.scalapy.stdlib.set[_T]]
/* skip override: __xor__ */
/* skip override: __lt__ */
/* skip override: __isub__ */
def issubset(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("issubset")("s" -> s).as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __le__ */
/* skip override: __ixor__ */
/* skip override: __ior__ */
/* skip override: isdisjoint */
def difference(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.py.Any])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.set[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("difference")("s" -> s).as[me.shadaj.scalapy.stdlib.set[_T]]
/* skip override: add */
}

object set extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("set")) with py.Object {





def apply[_T <: me.shadaj.scalapy.py.Any](iterable : me.shadaj.scalapy.typing.Iterable[_T] = null.asInstanceOf[me.shadaj.scalapy.typing.Iterable[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyNamed("iterable" -> iterable).as[me.shadaj.scalapy.stdlib.set[_T]]









/* attribute: __hash__ */



















}
/* <mypy.nodes.TypeAlias object at 0x7f86657d8540> */
def credits(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("credits")().as[me.shadaj.scalapy.py.None]
@py.native trait UnicodeError extends me.shadaj.scalapy.stdlib.ValueError {

}

object UnicodeError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("UnicodeError")) with py.Object {

}
/* TypeVarExpr:-1() */
@py.native trait `super` extends me.shadaj.scalapy.stdlib.`object` {

}

object `super` extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("super")) with py.Object {
def apply(t : me.shadaj.scalapy.py.Any, obj : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.`super` = as[me.shadaj.scalapy.py.Dynamic].applyNamed("t" -> t, "obj" -> obj).as[me.shadaj.scalapy.stdlib.`super`]
def apply(t : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.`super` = as[me.shadaj.scalapy.py.Dynamic].applyNamed("t" -> t).as[me.shadaj.scalapy.stdlib.`super`]
def apply(): me.shadaj.scalapy.stdlib.`super` = as[me.shadaj.scalapy.py.Dynamic].applyNamed().as[me.shadaj.scalapy.stdlib.`super`]
}
@py.native trait ReferenceError extends me.shadaj.scalapy.stdlib.Exception {

}

object ReferenceError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ReferenceError")) with py.Object {

}
/* cannot compute str */
def callable(__obj : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("callable")(__obj).as[me.shadaj.scalapy.stdlib.bool]
def delattr(__obj : me.shadaj.scalapy.py.Any, __name : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("delattr")(__obj, __name).as[me.shadaj.scalapy.py.None]
@py.native trait SyntaxWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object SyntaxWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SyntaxWarning")) with py.Object {

}
/* TypeVarExpr:-1() */
def isinstance(__obj : me.shadaj.scalapy.stdlib.`object`, __class_or_tuple : /* Union[builtins.type, builtins.tuple[Union[builtins.type, builtins.tuple[Any]]]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("isinstance")(__obj, __class_or_tuple).as[me.shadaj.scalapy.stdlib.bool]
@py.native trait BlockingIOError extends me.shadaj.scalapy.stdlib.OSError {
def characters_written: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("characters_written").as[me.shadaj.scalapy.stdlib.int]
}

object BlockingIOError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BlockingIOError")) with py.Object {
/* attribute: characters_written */
}
def compile(source : /* Union[builtins.str, builtins.bytes, _ast.mod, _ast.AST] */ me.shadaj.scalapy.py.Any, filename : /* Union[builtins.str, builtins.bytes, builtins._PathLike[Any]] */ me.shadaj.scalapy.py.Any, mode : me.shadaj.scalapy.stdlib.str, flags : me.shadaj.scalapy.stdlib.int, dont_inherit : me.shadaj.scalapy.stdlib.int, optimize : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("compile")(source, filename, mode, flags, dont_inherit, optimize).as[me.shadaj.scalapy.py.Any]
@py.native trait ConnectionResetError extends me.shadaj.scalapy.stdlib.ConnectionError {

}

object ConnectionResetError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ConnectionResetError")) with py.Object {

}
def open(file : /* Union[builtins.str, builtins.bytes, builtins.int, builtins._PathLike[Any]] */ me.shadaj.scalapy.py.Any, mode : me.shadaj.scalapy.stdlib.str, buffering : me.shadaj.scalapy.stdlib.int, encoding : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any, errors : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any, newline : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any, closefd : me.shadaj.scalapy.stdlib.bool, opener : /* Union[def (builtins.str, builtins.int) -> builtins.int, None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.typing.IO[me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("open")(file, mode, buffering, encoding, errors, newline, closefd, opener).as[me.shadaj.scalapy.typing.IO[me.shadaj.scalapy.py.Any]]
/* TypeVarExpr:-1(
  Variance(COVARIANT)) */
@py.native trait RecursionError extends me.shadaj.scalapy.stdlib.RuntimeError {

}

object RecursionError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("RecursionError")) with py.Object {

}
@py.native trait staticmethod extends me.shadaj.scalapy.stdlib.`object` {

def `__isabstractmethod__`: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__isabstractmethod__").as[me.shadaj.scalapy.stdlib.bool]
def `__func__`: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__func__").as[me.shadaj.scalapy.py.Any]
/* skip override: __new__ */
def __get__[_T <: me.shadaj.scalapy.py.Any](obj : _T, `type` : /* Union[Type[_T`-1], None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__get__")("obj" -> obj, "type" -> `type`).as[me.shadaj.scalapy.py.Any]
}

object staticmethod extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("staticmethod")) with py.Object {
def apply(f : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.staticmethod = as[me.shadaj.scalapy.py.Dynamic].applyNamed("f" -> f).as[me.shadaj.scalapy.stdlib.staticmethod]
/* attribute: __isabstractmethod__ */
/* attribute: __func__ */


}
@py.native trait Exception extends me.shadaj.scalapy.stdlib.BaseException {

}

object Exception extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Exception")) with py.Object {

}
@py.native trait FileExistsError extends me.shadaj.scalapy.stdlib.OSError {

}

object FileExistsError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FileExistsError")) with py.Object {

}
@py.native trait `object` extends me.shadaj.scalapy.py.Any {
def __repr__(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__repr__")().as[me.shadaj.scalapy.stdlib.str]
def `__slots__`: /* Union[builtins.str, typing.Iterable[builtins.str]] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__slots__").as[/* Union[builtins.str, typing.Iterable[builtins.str]] */ me.shadaj.scalapy.py.Any]
def __ne__(o : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ne__")("o" -> o).as[me.shadaj.scalapy.stdlib.bool]
def __sizeof__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__sizeof__")().as[me.shadaj.scalapy.stdlib.int]
def __dir__(): me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__dir__")().as[me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.str]]
def __format__(format_spec : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__format__")("format_spec" -> format_spec).as[me.shadaj.scalapy.stdlib.str]
def `__doc__`: /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[/* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any]
def __init_subclass__(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__init_subclass__")().as[me.shadaj.scalapy.py.None]
def __reduce__(): /* Union[builtins.str, builtins.tuple[Any]] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__reduce__")().as[/* Union[builtins.str, builtins.tuple[Any]] */ me.shadaj.scalapy.py.Any]
def __hash__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__hash__")().as[me.shadaj.scalapy.stdlib.int]
def __eq__(o : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__eq__")("o" -> o).as[me.shadaj.scalapy.stdlib.bool]
def __str__(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__str__")().as[me.shadaj.scalapy.stdlib.str]
def `__annotations__`: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__annotations__").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
def `__dict__`: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__dict__").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
def __getattribute__(name : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getattribute__")("name" -> name).as[me.shadaj.scalapy.py.Any]
def __new__(): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__new__")().as[me.shadaj.scalapy.py.Any]
def __class__(): /* Type[_T`-1] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__class__")().as[/* Type[_T`-1] */ me.shadaj.scalapy.py.Any]
def __class__(__type : /* Type[builtins.object] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__class__")("__type" -> __type).as[me.shadaj.scalapy.py.None]

def __delattr__(name : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__delattr__")("name" -> name).as[me.shadaj.scalapy.py.None]
def __setattr__(name : me.shadaj.scalapy.stdlib.str, member_value : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__setattr__")("name" -> name, "value" -> member_value).as[me.shadaj.scalapy.py.None]
def __reduce_ex__(protocol : me.shadaj.scalapy.stdlib.int): /* Union[builtins.str, builtins.tuple[Any]] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__reduce_ex__")("protocol" -> protocol).as[/* Union[builtins.str, builtins.tuple[Any]] */ me.shadaj.scalapy.py.Any]
def `__module__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__module__").as[me.shadaj.scalapy.stdlib.str]
}

object `object` extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("object")) with py.Object {

/* attribute: __slots__ */




/* attribute: __doc__ */





/* attribute: __annotations__ */
/* attribute: __dict__ */



def apply(): me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].applyNamed().as[me.shadaj.scalapy.stdlib.`object`]



/* attribute: __module__ */
}
@py.native trait NotADirectoryError extends me.shadaj.scalapy.stdlib.OSError {

}

object NotADirectoryError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("NotADirectoryError")) with py.Object {

}
def quit(code : me.shadaj.scalapy.stdlib.`object`): /* <nothing> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("quit")(code).as[/* <nothing> */ me.shadaj.scalapy.py.Any]
@py.native trait classmethod extends me.shadaj.scalapy.stdlib.`object` {

def `__isabstractmethod__`: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__isabstractmethod__").as[me.shadaj.scalapy.stdlib.bool]
def `__func__`: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__func__").as[me.shadaj.scalapy.py.Any]
/* skip override: __new__ */
def __get__[_T <: me.shadaj.scalapy.py.Any](obj : _T, `type` : /* Union[Type[_T`-1], None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__get__")("obj" -> obj, "type" -> `type`).as[me.shadaj.scalapy.py.Any]
}

object classmethod extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("classmethod")) with py.Object {
def apply(f : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.classmethod = as[me.shadaj.scalapy.py.Dynamic].applyNamed("f" -> f).as[me.shadaj.scalapy.stdlib.classmethod]
/* attribute: __isabstractmethod__ */
/* attribute: __func__ */


}
/* cannot compute str */
def ascii(__obj : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("ascii")(__obj).as[me.shadaj.scalapy.stdlib.str]
def setattr(__obj : me.shadaj.scalapy.py.Any, __name : me.shadaj.scalapy.stdlib.str, __value : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("setattr")(__obj, __name, __value).as[me.shadaj.scalapy.py.None]
def eval(__source : /* Union[builtins.str, builtins.bytes, types.CodeType] */ me.shadaj.scalapy.py.Any, __globals : /* Union[builtins.dict[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any, __locals : /* Union[typing.Mapping[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("eval")(__source, __globals, __locals).as[me.shadaj.scalapy.py.Any]
@py.native trait UnboundLocalError extends me.shadaj.scalapy.stdlib.NameError {

}

object UnboundLocalError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("UnboundLocalError")) with py.Object {

}
def license(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("license")().as[me.shadaj.scalapy.py.None]
/* cannot compute str */
@py.native trait ModuleNotFoundError extends me.shadaj.scalapy.stdlib.ImportError {

}

object ModuleNotFoundError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ModuleNotFoundError")) with py.Object {

}
def __import__(name : me.shadaj.scalapy.stdlib.str, globals : /* Union[typing.Mapping[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any, locals : /* Union[typing.Mapping[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any, fromlist : me.shadaj.scalapy.typing.Sequence[me.shadaj.scalapy.stdlib.str], level : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("__import__")(name, globals, locals, fromlist, level).as[me.shadaj.scalapy.py.Any]
@py.native trait SystemError extends me.shadaj.scalapy.stdlib.Exception {

}

object SystemError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SystemError")) with py.Object {

}
def help(args : me.shadaj.scalapy.py.Any, kwds : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("help")(args, kwds).as[me.shadaj.scalapy.py.None]
@py.native trait FloatingPointError extends me.shadaj.scalapy.stdlib.ArithmeticError {

}

object FloatingPointError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FloatingPointError")) with py.Object {

}
@py.native trait str extends me.shadaj.scalapy.typing.Sequence[me.shadaj.scalapy.stdlib.str] with me.shadaj.scalapy.stdlib.`object` {

def join(__iterable : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("join")("__iterable" -> __iterable).as[me.shadaj.scalapy.stdlib.str]
def center(__width : me.shadaj.scalapy.stdlib.int, __fillchar : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("center")("__width" -> __width, "__fillchar" -> __fillchar).as[me.shadaj.scalapy.stdlib.str]
def capitalize(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("capitalize")().as[me.shadaj.scalapy.stdlib.str]
def __rmul__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("n" -> n).as[me.shadaj.scalapy.stdlib.str]
def >=(x : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def format_map(map : me.shadaj.scalapy.typing.Mapping[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("format_map")("map" -> map).as[me.shadaj.scalapy.stdlib.str]
def format(args : me.shadaj.scalapy.stdlib.`object`, kwargs : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("format")("args" -> args, "kwargs" -> kwargs).as[me.shadaj.scalapy.stdlib.str]
def isspace(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isspace")().as[me.shadaj.scalapy.stdlib.bool]
def encode(encoding : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], errors : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("encode")("encoding" -> encoding, "errors" -> errors).as[me.shadaj.scalapy.stdlib.bytes]
def find(sub : me.shadaj.scalapy.stdlib.str, __start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], __end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("find")("sub" -> sub, "__start" -> __start, "__end" -> __end).as[me.shadaj.scalapy.stdlib.int]
def __getnewargs__(): /* Tuple[builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getnewargs__")().as[/* Tuple[builtins.str] */ me.shadaj.scalapy.py.Any]
def rjust(__width : me.shadaj.scalapy.stdlib.int, __fillchar : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rjust")("__width" -> __width, "__fillchar" -> __fillchar).as[me.shadaj.scalapy.stdlib.str]
/* skip override: count */
/* skip override: __eq__ */
def isdigit(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isdigit")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __str__ */
/* skip override: __repr__ */
def rpartition(__sep : me.shadaj.scalapy.stdlib.str): /* Tuple[builtins.str, builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rpartition")("__sep" -> __sep).as[/* Tuple[builtins.str, builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
/* skip override: __contains__ */
def replace(__old : me.shadaj.scalapy.stdlib.str, __new : me.shadaj.scalapy.stdlib.str, __count : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("replace")("__old" -> __old, "__new" -> __new, "__count" -> __count).as[me.shadaj.scalapy.stdlib.str]
def ljust(__width : me.shadaj.scalapy.stdlib.int, __fillchar : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ljust")("__width" -> __width, "__fillchar" -> __fillchar).as[me.shadaj.scalapy.stdlib.str]
def swapcase(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("swapcase")().as[me.shadaj.scalapy.stdlib.str]
/* skip override: __ne__ */
def <(x : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def partition(__sep : me.shadaj.scalapy.stdlib.str): /* Tuple[builtins.str, builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("partition")("__sep" -> __sep).as[/* Tuple[builtins.str, builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def isidentifier(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isidentifier")().as[me.shadaj.scalapy.stdlib.bool]
def __mod__(x : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mod__")("x" -> x).as[me.shadaj.scalapy.stdlib.str]
def isupper(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isupper")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __iter__ */
def islower(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("islower")().as[me.shadaj.scalapy.stdlib.bool]
def lower(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lower")().as[me.shadaj.scalapy.stdlib.str]
def strip(__chars : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("strip")("__chars" -> __chars).as[me.shadaj.scalapy.stdlib.str]
def *(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("n" -> n).as[me.shadaj.scalapy.stdlib.str]
def upper(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("upper")().as[me.shadaj.scalapy.stdlib.str]
def startswith(prefix : /* Union[builtins.str, builtins.tuple[builtins.str]] */ me.shadaj.scalapy.py.Any, start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("startswith")("prefix" -> prefix, "start" -> start, "end" -> end).as[me.shadaj.scalapy.stdlib.bool]

def zfill(__width : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("zfill")("__width" -> __width).as[me.shadaj.scalapy.stdlib.str]
def rindex(sub : me.shadaj.scalapy.stdlib.str, __start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], __end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rindex")("sub" -> sub, "__start" -> __start, "__end" -> __end).as[me.shadaj.scalapy.stdlib.int]
def <=(x : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def isnumeric(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isnumeric")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __len__ */
def isprintable(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isprintable")().as[me.shadaj.scalapy.stdlib.bool]
def splitlines(keepends : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("splitlines")("keepends" -> keepends).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str]]
def >(x : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__gt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def endswith(suffix : /* Union[builtins.str, builtins.tuple[builtins.str]] */ me.shadaj.scalapy.py.Any, start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("endswith")("suffix" -> suffix, "start" -> start, "end" -> end).as[me.shadaj.scalapy.stdlib.bool]
def split(sep : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], maxsplit : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("split")("sep" -> sep, "maxsplit" -> maxsplit).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str]]
def rstrip(__chars : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rstrip")("__chars" -> __chars).as[me.shadaj.scalapy.stdlib.str]
def expandtabs(tabsize : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("expandtabs")("tabsize" -> tabsize).as[me.shadaj.scalapy.stdlib.str]
def translate(__table : /* Union[typing.Mapping[builtins.int, Union[builtins.int, builtins.str, None]], typing.Sequence[Union[builtins.int, builtins.str, None]]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("translate")("__table" -> __table).as[me.shadaj.scalapy.stdlib.str]
/* skip override: __getitem__ */
def istitle(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("istitle")().as[me.shadaj.scalapy.stdlib.bool]
def isalnum(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isalnum")().as[me.shadaj.scalapy.stdlib.bool]
def title(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("title")().as[me.shadaj.scalapy.stdlib.str]
def lstrip(__chars : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lstrip")("__chars" -> __chars).as[me.shadaj.scalapy.stdlib.str]
def isalpha(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isalpha")().as[me.shadaj.scalapy.stdlib.bool]
def casefold(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("casefold")().as[me.shadaj.scalapy.stdlib.str]
def rfind(sub : me.shadaj.scalapy.stdlib.str, __start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], __end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rfind")("sub" -> sub, "__start" -> __start, "__end" -> __end).as[me.shadaj.scalapy.stdlib.int]
def isdecimal(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isdecimal")().as[me.shadaj.scalapy.stdlib.bool]
def +(s : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("s" -> s).as[me.shadaj.scalapy.stdlib.str]
def rsplit(sep : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], maxsplit : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rsplit")("sep" -> sep, "maxsplit" -> maxsplit).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str]]
/* skip override: index */
def isascii(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isascii")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __hash__ */
}

object str extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("str")) with py.Object {
/* function: maketrans */



































// def apply(o : me.shadaj.scalapy.stdlib.`object` = null.asInstanceOf[me.shadaj.scalapy.stdlib.`object`]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyNamed("o" -> o).as[me.shadaj.scalapy.stdlib.str]
def apply(o : me.shadaj.scalapy.stdlib.bytes, encoding : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], errors : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyNamed("o" -> o, "encoding" -> encoding, "errors" -> errors).as[me.shadaj.scalapy.stdlib.str]



























}
@py.native trait ConnectionError extends me.shadaj.scalapy.stdlib.OSError {

}

object ConnectionError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ConnectionError")) with py.Object {

}
@py.native trait bytes extends me.shadaj.scalapy.typing.ByteString {
def join(__iterable_of_bytes : me.shadaj.scalapy.typing.Iterable[/* Union[typing.ByteString, builtins.memoryview] */ me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("join")("__iterable_of_bytes" -> __iterable_of_bytes).as[me.shadaj.scalapy.stdlib.bytes]
def center(__width : me.shadaj.scalapy.stdlib.int, __fillchar : me.shadaj.scalapy.stdlib.bytes = null.asInstanceOf[me.shadaj.scalapy.stdlib.bytes]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("center")("__width" -> __width, "__fillchar" -> __fillchar).as[me.shadaj.scalapy.stdlib.bytes]
def partition(__sep : me.shadaj.scalapy.stdlib.bytes): /* Tuple[builtins.bytes, builtins.bytes, builtins.bytes] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("partition")("__sep" -> __sep).as[/* Tuple[builtins.bytes, builtins.bytes, builtins.bytes] */ me.shadaj.scalapy.py.Any]
def __rmul__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("n" -> n).as[me.shadaj.scalapy.stdlib.bytes]
def rfind(sub : /* Union[builtins.bytes, builtins.int] */ me.shadaj.scalapy.py.Any, start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rfind")("sub" -> sub, "start" -> start, "end" -> end).as[me.shadaj.scalapy.stdlib.int]
def >=(x : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def isspace(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isspace")().as[me.shadaj.scalapy.stdlib.bool]
def find(sub : /* Union[builtins.bytes, builtins.int] */ me.shadaj.scalapy.py.Any, start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("find")("sub" -> sub, "start" -> start, "end" -> end).as[me.shadaj.scalapy.stdlib.int]
def __getnewargs__(): /* Tuple[builtins.bytes] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getnewargs__")().as[/* Tuple[builtins.bytes] */ me.shadaj.scalapy.py.Any]
def rjust(__width : me.shadaj.scalapy.stdlib.int, __fillchar : me.shadaj.scalapy.stdlib.bytes = null.asInstanceOf[me.shadaj.scalapy.stdlib.bytes]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rjust")("__width" -> __width, "__fillchar" -> __fillchar).as[me.shadaj.scalapy.stdlib.bytes]
/* skip override: __eq__ */
def isdigit(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isdigit")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __str__ */
/* skip override: count */
def hex(sep : /* Union[builtins.str, builtins.bytes] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], bytes_per_sep : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("hex")("sep" -> sep, "bytes_per_sep" -> bytes_per_sep).as[me.shadaj.scalapy.stdlib.str]
/* skip override: __repr__ */
def rpartition(__sep : me.shadaj.scalapy.stdlib.bytes): /* Tuple[builtins.bytes, builtins.bytes, builtins.bytes] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rpartition")("__sep" -> __sep).as[/* Tuple[builtins.bytes, builtins.bytes, builtins.bytes] */ me.shadaj.scalapy.py.Any]
/* skip override: __contains__ */
def replace(__old : me.shadaj.scalapy.stdlib.bytes, __new : me.shadaj.scalapy.stdlib.bytes, __count : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("replace")("__old" -> __old, "__new" -> __new, "__count" -> __count).as[me.shadaj.scalapy.stdlib.bytes]
def ljust(__width : me.shadaj.scalapy.stdlib.int, __fillchar : me.shadaj.scalapy.stdlib.bytes = null.asInstanceOf[me.shadaj.scalapy.stdlib.bytes]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ljust")("__width" -> __width, "__fillchar" -> __fillchar).as[me.shadaj.scalapy.stdlib.bytes]
/* member: maketrans */
def __int__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__int__")().as[me.shadaj.scalapy.stdlib.int]
def swapcase(): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("swapcase")().as[me.shadaj.scalapy.stdlib.bytes]
/* skip override: __ne__ */
def <(x : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
/* member: fromhex */
def capitalize(): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("capitalize")().as[me.shadaj.scalapy.stdlib.bytes]
def __mod__(member_value : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mod__")("value" -> member_value).as[me.shadaj.scalapy.stdlib.bytes]
def isupper(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isupper")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __iter__ */
def islower(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("islower")().as[me.shadaj.scalapy.stdlib.bool]
def lower(): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lower")().as[me.shadaj.scalapy.stdlib.bytes]
def strip(__bytes : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("strip")("__bytes" -> __bytes).as[me.shadaj.scalapy.stdlib.bytes]
def decode(encoding : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], errors : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("decode")("encoding" -> encoding, "errors" -> errors).as[me.shadaj.scalapy.stdlib.str]
def *(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("n" -> n).as[me.shadaj.scalapy.stdlib.bytes]
def upper(): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("upper")().as[me.shadaj.scalapy.stdlib.bytes]
def startswith(prefix : /* Union[builtins.bytes, builtins.tuple[builtins.bytes]] */ me.shadaj.scalapy.py.Any, start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("startswith")("prefix" -> prefix, "start" -> start, "end" -> end).as[me.shadaj.scalapy.stdlib.bool]

def zfill(__width : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("zfill")("__width" -> __width).as[me.shadaj.scalapy.stdlib.bytes]
def rindex(sub : /* Union[builtins.bytes, builtins.int] */ me.shadaj.scalapy.py.Any, start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rindex")("sub" -> sub, "start" -> start, "end" -> end).as[me.shadaj.scalapy.stdlib.int]
def <=(x : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __len__ */
def __float__(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__float__")().as[me.shadaj.scalapy.stdlib.float]
def splitlines(keepends : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytes] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("splitlines")("keepends" -> keepends).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytes]]
def >(x : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__gt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def endswith(suffix : /* Union[builtins.bytes, builtins.tuple[builtins.bytes]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("endswith")("suffix" -> suffix).as[me.shadaj.scalapy.stdlib.bool]
def split(sep : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], maxsplit : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytes] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("split")("sep" -> sep, "maxsplit" -> maxsplit).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytes]]
def rstrip(__bytes : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rstrip")("__bytes" -> __bytes).as[me.shadaj.scalapy.stdlib.bytes]
def expandtabs(tabsize : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("expandtabs")("tabsize" -> tabsize).as[me.shadaj.scalapy.stdlib.bytes]
def translate(__table : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any, delete : me.shadaj.scalapy.stdlib.bytes = null.asInstanceOf[me.shadaj.scalapy.stdlib.bytes]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("translate")("__table" -> __table, "delete" -> delete).as[me.shadaj.scalapy.stdlib.bytes]
/* skip override: __getitem__ */
/* skip override: __getitem__ */
def istitle(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("istitle")().as[me.shadaj.scalapy.stdlib.bool]
def isalnum(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isalnum")().as[me.shadaj.scalapy.stdlib.bool]
def title(): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("title")().as[me.shadaj.scalapy.stdlib.bytes]
def lstrip(__bytes : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lstrip")("__bytes" -> __bytes).as[me.shadaj.scalapy.stdlib.bytes]
def isalpha(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isalpha")().as[me.shadaj.scalapy.stdlib.bool]
def +(s : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("s" -> s).as[me.shadaj.scalapy.stdlib.bytes]
def rsplit(sep : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], maxsplit : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytes] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rsplit")("sep" -> sep, "maxsplit" -> maxsplit).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytes]]
/* skip override: index */
def isascii(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isascii")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __hash__ */
}

object bytes extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("bytes")) with py.Object {




















/* member: maketrans */




/* member: fromhex */











def apply(ints : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyNamed("ints" -> ints).as[me.shadaj.scalapy.stdlib.bytes]
def apply(string : me.shadaj.scalapy.stdlib.str, encoding : me.shadaj.scalapy.stdlib.str, errors : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyNamed("string" -> string, "encoding" -> encoding, "errors" -> errors).as[me.shadaj.scalapy.stdlib.bytes]
/* skip conflict: __init__ */
def apply(): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyNamed().as[me.shadaj.scalapy.stdlib.bytes]
/* skip conflict: __init__ */























}
def dir(__o : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("dir")(__o).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str]]
/* <mypy.nodes.TypeAlias object at 0x7f86657d83c0> */
def id(__obj : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("id")(__obj).as[me.shadaj.scalapy.stdlib.int]
/* TypeVarExpr:-1() */
def hash(__obj : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("hash")(__obj).as[me.shadaj.scalapy.stdlib.int]
@py.native trait BaseException extends me.shadaj.scalapy.stdlib.`object` {
def `__context__`: /* Union[builtins.BaseException, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__context__").as[/* Union[builtins.BaseException, None] */ me.shadaj.scalapy.py.Any]
/* skip override: __str__ */
/* skip override: __repr__ */
def `__suppress_context__`: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__suppress_context__").as[me.shadaj.scalapy.stdlib.bool]
def with_traceback(tb : /* Union[types.TracebackType, None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.BaseException = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("with_traceback")("tb" -> tb).as[me.shadaj.scalapy.stdlib.BaseException]

def `__cause__`: /* Union[builtins.BaseException, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__cause__").as[/* Union[builtins.BaseException, None] */ me.shadaj.scalapy.py.Any]
def `__traceback__`: /* Union[types.TracebackType, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__traceback__").as[/* Union[types.TracebackType, None] */ me.shadaj.scalapy.py.Any]
def args: me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("args").as[me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.py.Any]]
}

object BaseException extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BaseException")) with py.Object {
/* attribute: __context__ */


/* attribute: __suppress_context__ */

def apply(args : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.BaseException = as[me.shadaj.scalapy.py.Dynamic].applyNamed("args" -> args).as[me.shadaj.scalapy.stdlib.BaseException]
/* attribute: __cause__ */
/* attribute: __traceback__ */
/* attribute: args */
}
/* cannot compute str */
@py.native trait IndentationError extends me.shadaj.scalapy.stdlib.SyntaxError {

}

object IndentationError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IndentationError")) with py.Object {

}
@py.native trait NameError extends me.shadaj.scalapy.stdlib.Exception {

}

object NameError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("NameError")) with py.Object {

}
def reveal_type: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("reveal_type").as[me.shadaj.scalapy.py.Any]
@py.native trait bool extends me.shadaj.scalapy.stdlib.int {
/* skip override: __and__ */
/* skip override: __and__ */
/* skip override: __getnewargs__ */
/* skip override: __xor__ */
/* skip override: __xor__ */

/* skip override: __ror__ */
/* skip override: __ror__ */
/* skip override: __rxor__ */
/* skip override: __rxor__ */
/* skip override: __rand__ */
/* skip override: __rand__ */
/* skip override: __or__ */
/* skip override: __or__ */
}

object bool extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("bool")) with py.Object {
  implicit def fromBoolean(boolean: Boolean) = (boolean: me.shadaj.scalapy.py.Any).as[bool]
  implicit def toBoolean(bool: bool) = bool.as[Boolean]



def apply(o : me.shadaj.scalapy.stdlib.`object` = null.asInstanceOf[me.shadaj.scalapy.stdlib.`object`]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyNamed("o" -> o).as[me.shadaj.scalapy.stdlib.bool]




}
@py.native trait BrokenPipeError extends me.shadaj.scalapy.stdlib.ConnectionError {

}

object BrokenPipeError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BrokenPipeError")) with py.Object {

}
@py.native trait bytearray extends me.shadaj.scalapy.typing.MutableSequence[me.shadaj.scalapy.stdlib.int] with me.shadaj.scalapy.typing.ByteString {
def center(__width : me.shadaj.scalapy.stdlib.int, __fillchar : me.shadaj.scalapy.stdlib.bytes = null.asInstanceOf[me.shadaj.scalapy.stdlib.bytes]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("center")("__width" -> __width, "__fillchar" -> __fillchar).as[me.shadaj.scalapy.stdlib.bytearray]
def partition(__sep : me.shadaj.scalapy.stdlib.bytes): /* Tuple[builtins.bytearray, builtins.bytearray, builtins.bytearray] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("partition")("__sep" -> __sep).as[/* Tuple[builtins.bytearray, builtins.bytearray, builtins.bytearray] */ me.shadaj.scalapy.py.Any]
def __rmul__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("n" -> n).as[me.shadaj.scalapy.stdlib.bytearray]
def copy(): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("copy")().as[me.shadaj.scalapy.stdlib.bytearray]
def rfind(__sub : /* Union[builtins.bytes, builtins.int] */ me.shadaj.scalapy.py.Any, __start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], __end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rfind")("__sub" -> __sub, "__start" -> __start, "__end" -> __end).as[me.shadaj.scalapy.stdlib.int]
def >=(x : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def isspace(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isspace")().as[me.shadaj.scalapy.stdlib.bool]
def find(__sub : /* Union[builtins.bytes, builtins.int] */ me.shadaj.scalapy.py.Any, __start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], __end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("find")("__sub" -> __sub, "__start" -> __start, "__end" -> __end).as[me.shadaj.scalapy.stdlib.int]
def rjust(__width : me.shadaj.scalapy.stdlib.int, __fillchar : me.shadaj.scalapy.stdlib.bytes = null.asInstanceOf[me.shadaj.scalapy.stdlib.bytes]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rjust")("__width" -> __width, "__fillchar" -> __fillchar).as[me.shadaj.scalapy.stdlib.bytearray]
/* skip override: __eq__ */
def isdigit(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isdigit")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __str__ */
/* skip override: count */
def hex(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("hex")().as[me.shadaj.scalapy.stdlib.str]
/* skip override: __repr__ */
def rpartition(__sep : me.shadaj.scalapy.stdlib.bytes): /* Tuple[builtins.bytearray, builtins.bytearray, builtins.bytearray] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rpartition")("__sep" -> __sep).as[/* Tuple[builtins.bytearray, builtins.bytearray, builtins.bytearray] */ me.shadaj.scalapy.py.Any]
/* skip override: __contains__ */
def replace(__old : me.shadaj.scalapy.stdlib.bytes, __new : me.shadaj.scalapy.stdlib.bytes, __count : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("replace")("__old" -> __old, "__new" -> __new, "__count" -> __count).as[me.shadaj.scalapy.stdlib.bytearray]
def ljust(__width : me.shadaj.scalapy.stdlib.int, __fillchar : me.shadaj.scalapy.stdlib.bytes = null.asInstanceOf[me.shadaj.scalapy.stdlib.bytes]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ljust")("__width" -> __width, "__fillchar" -> __fillchar).as[me.shadaj.scalapy.stdlib.bytearray]
def __imul__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__imul__")("n" -> n).as[me.shadaj.scalapy.stdlib.bytearray]
/* skip override: __delitem__ */
/* member: maketrans */
def __int__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__int__")().as[me.shadaj.scalapy.stdlib.int]
def join(__iterable_of_bytes : me.shadaj.scalapy.typing.Iterable[/* Union[typing.ByteString, builtins.memoryview] */ me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("join")("__iterable_of_bytes" -> __iterable_of_bytes).as[me.shadaj.scalapy.stdlib.bytearray]
/* skip override: insert */
def swapcase(): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("swapcase")().as[me.shadaj.scalapy.stdlib.bytearray]
/* skip override: __ne__ */
def <(x : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
/* member: fromhex */
def capitalize(): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("capitalize")().as[me.shadaj.scalapy.stdlib.bytearray]
/* skip override: __setitem__ */
/* skip override: __setitem__ */
def __mod__(member_value : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mod__")("value" -> member_value).as[me.shadaj.scalapy.stdlib.bytes]
def isupper(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isupper")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __iter__ */
def islower(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("islower")().as[me.shadaj.scalapy.stdlib.bool]
def lower(): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lower")().as[me.shadaj.scalapy.stdlib.bytearray]
def strip(__bytes : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("strip")("__bytes" -> __bytes).as[me.shadaj.scalapy.stdlib.bytearray]
def decode(encoding : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], errors : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("decode")("encoding" -> encoding, "errors" -> errors).as[me.shadaj.scalapy.stdlib.str]
def *(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("n" -> n).as[me.shadaj.scalapy.stdlib.bytearray]
/* skip override: __iadd__ */
def upper(): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("upper")().as[me.shadaj.scalapy.stdlib.bytearray]
def startswith(__prefix : /* Union[builtins.bytes, builtins.tuple[builtins.bytes]] */ me.shadaj.scalapy.py.Any, __start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], __end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("startswith")("__prefix" -> __prefix, "__start" -> __start, "__end" -> __end).as[me.shadaj.scalapy.stdlib.bool]

def zfill(__width : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("zfill")("__width" -> __width).as[me.shadaj.scalapy.stdlib.bytearray]
def rindex(__sub : /* Union[builtins.bytes, builtins.int] */ me.shadaj.scalapy.py.Any, __start : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], __end : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rindex")("__sub" -> __sub, "__start" -> __start, "__end" -> __end).as[me.shadaj.scalapy.stdlib.int]
def <=(x : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __len__ */
def __float__(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__float__")().as[me.shadaj.scalapy.stdlib.float]
def splitlines(keepends : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytearray] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("splitlines")("keepends" -> keepends).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytearray]]
def >(x : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__gt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def endswith(__suffix : /* Union[builtins.bytes, builtins.tuple[builtins.bytes]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("endswith")("__suffix" -> __suffix).as[me.shadaj.scalapy.stdlib.bool]
def split(sep : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], maxsplit : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytearray] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("split")("sep" -> sep, "maxsplit" -> maxsplit).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytearray]]
def rstrip(__bytes : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rstrip")("__bytes" -> __bytes).as[me.shadaj.scalapy.stdlib.bytearray]
def expandtabs(tabsize : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("expandtabs")("tabsize" -> tabsize).as[me.shadaj.scalapy.stdlib.bytearray]
def translate(__table : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any, delete : me.shadaj.scalapy.stdlib.bytes = null.asInstanceOf[me.shadaj.scalapy.stdlib.bytes]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("translate")("__table" -> __table, "delete" -> delete).as[me.shadaj.scalapy.stdlib.bytearray]
/* skip override: __getitem__ */
/* skip override: __getitem__ */
def istitle(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("istitle")().as[me.shadaj.scalapy.stdlib.bool]
def isalnum(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isalnum")().as[me.shadaj.scalapy.stdlib.bool]
def title(): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("title")().as[me.shadaj.scalapy.stdlib.bytearray]
def lstrip(__bytes : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lstrip")("__bytes" -> __bytes).as[me.shadaj.scalapy.stdlib.bytearray]
def isalpha(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isalpha")().as[me.shadaj.scalapy.stdlib.bool]
def +(s : me.shadaj.scalapy.stdlib.bytes): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("s" -> s).as[me.shadaj.scalapy.stdlib.bytearray]
def rsplit(sep : /* Union[builtins.bytes, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], maxsplit : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytearray] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rsplit")("sep" -> sep, "maxsplit" -> maxsplit).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.bytearray]]
/* skip override: index */
def isascii(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isascii")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __hash__ */
}

object bytearray extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("bytearray")) with py.Object {





















/* member: maketrans */






/* member: fromhex */













def apply(): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyNamed().as[me.shadaj.scalapy.stdlib.bytearray]
def apply(ints : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyNamed("ints" -> ints).as[me.shadaj.scalapy.stdlib.bytearray]
def apply(string : me.shadaj.scalapy.stdlib.str, encoding : me.shadaj.scalapy.stdlib.str, errors : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.stdlib.bytearray = as[me.shadaj.scalapy.py.Dynamic].applyNamed("string" -> string, "encoding" -> encoding, "errors" -> errors).as[me.shadaj.scalapy.stdlib.bytearray]
/* skip conflict: __init__ */






















/* attribute: __hash__ */
}
@py.native trait range extends me.shadaj.scalapy.typing.Sequence[me.shadaj.scalapy.stdlib.int] {
/* skip override: count */
/* skip override: __iter__ */

def stop: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("stop").as[me.shadaj.scalapy.stdlib.int]
/* skip override: __len__ */
/* skip override: __getitem__ */
/* skip override: __getitem__ */
/* skip override: __reversed__ */
def start: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("start").as[me.shadaj.scalapy.stdlib.int]
/* skip override: index */
/* skip override: __repr__ */
/* skip override: __contains__ */
def step: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("step").as[me.shadaj.scalapy.stdlib.int]
}

object range extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("range")) with py.Object {


def apply(stop : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.range = as[me.shadaj.scalapy.py.Dynamic].applyNamed("stop" -> stop).as[me.shadaj.scalapy.stdlib.range]
def apply(start : me.shadaj.scalapy.stdlib.int, stop : me.shadaj.scalapy.stdlib.int, step : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.range = as[me.shadaj.scalapy.py.Dynamic].applyNamed("start" -> start, "stop" -> stop, "step" -> step).as[me.shadaj.scalapy.stdlib.range]
/* attribute: stop */



/* attribute: start */



/* attribute: step */
}
def sorted[_T <: me.shadaj.scalapy.py.Any](__iterable : me.shadaj.scalapy.typing.Iterable[_T], key : /* Union[def (_T`-1) -> Any, None] */ me.shadaj.scalapy.py.Any, reverse : me.shadaj.scalapy.stdlib.bool)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.list[_T]]): me.shadaj.scalapy.stdlib.list[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("sorted")(__iterable, key, reverse).as[me.shadaj.scalapy.stdlib.list[_T]]
@py.native trait enumerate[_T <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Iterator[/* Tuple[builtins.int, _T`1] */ me.shadaj.scalapy.py.Any] {
/* skip override: __iter__ */

/* skip override: __next__ */
}

object enumerate extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("enumerate")) with py.Object {

def apply[_T <: me.shadaj.scalapy.py.Any](iterable : me.shadaj.scalapy.typing.Iterable[_T], start : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.enumerate[_T] = as[me.shadaj.scalapy.py.Dynamic].applyNamed("iterable" -> iterable, "start" -> start).as[me.shadaj.scalapy.stdlib.enumerate[_T]]

}
@py.native trait memoryview extends me.shadaj.scalapy.typing.Sized with me.shadaj.scalapy.typing.Container[me.shadaj.scalapy.stdlib.int] {
def hex(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("hex")().as[me.shadaj.scalapy.stdlib.str]
def contiguous: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("contiguous").as[me.shadaj.scalapy.stdlib.bool]
def toreadonly(): me.shadaj.scalapy.stdlib.memoryview = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("toreadonly")().as[me.shadaj.scalapy.stdlib.memoryview]
/* skip override: __len__ */
def cast(format : me.shadaj.scalapy.stdlib.str, shape : /* Union[builtins.list[builtins.int], Tuple[builtins.int]] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.memoryview = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cast")("format" -> format, "shape" -> shape).as[me.shadaj.scalapy.stdlib.memoryview]
def __getitem__(i : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getitem__")("i" -> i).as[me.shadaj.scalapy.stdlib.int]
def __getitem__(s : me.shadaj.scalapy.stdlib.slice): me.shadaj.scalapy.stdlib.memoryview = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getitem__")("s" -> s).as[me.shadaj.scalapy.stdlib.memoryview]
def __exit__(exc_type : /* Union[Type[builtins.BaseException], None] */ me.shadaj.scalapy.py.Any, exc_val : /* Union[builtins.BaseException, None] */ me.shadaj.scalapy.py.Any, exc_tb : /* Union[types.TracebackType, None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__exit__")("exc_type" -> exc_type, "exc_val" -> exc_val, "exc_tb" -> exc_tb).as[me.shadaj.scalapy.py.None]
def suboffsets: /* Union[builtins.tuple[builtins.int], None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("suboffsets").as[/* Union[builtins.tuple[builtins.int], None] */ me.shadaj.scalapy.py.Any]
def f_contiguous: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("f_contiguous").as[me.shadaj.scalapy.stdlib.bool]
def ndim: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ndim").as[me.shadaj.scalapy.stdlib.int]
def c_contiguous: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("c_contiguous").as[me.shadaj.scalapy.stdlib.bool]
def format: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("format").as[me.shadaj.scalapy.stdlib.str]
def tobytes(order : /* Union[Literal['C'], Literal['F'], Literal['A'], None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tobytes")("order" -> order).as[me.shadaj.scalapy.stdlib.bytes]
def tolist(): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.int] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tolist")().as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.int]]
/* skip override: __contains__ */
def __setitem__(s : me.shadaj.scalapy.stdlib.slice, o : me.shadaj.scalapy.stdlib.memoryview): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__setitem__")("s" -> s, "o" -> o).as[me.shadaj.scalapy.py.None]
/* skip conflict: __setitem__ */
/* skip conflict: __setitem__ */
def __enter__(): me.shadaj.scalapy.stdlib.memoryview = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__enter__")().as[me.shadaj.scalapy.stdlib.memoryview]
def __iter__(): me.shadaj.scalapy.typing.Iterator[me.shadaj.scalapy.stdlib.int] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iter__")().as[me.shadaj.scalapy.typing.Iterator[me.shadaj.scalapy.stdlib.int]]
def obj: /* Union[builtins.bytes, builtins.bytearray] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("obj").as[/* Union[builtins.bytes, builtins.bytearray] */ me.shadaj.scalapy.py.Any]
def readonly: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("readonly").as[me.shadaj.scalapy.stdlib.bool]
def strides: /* Union[builtins.tuple[builtins.int], None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("strides").as[/* Union[builtins.tuple[builtins.int], None] */ me.shadaj.scalapy.py.Any]

def itemsize: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("itemsize").as[me.shadaj.scalapy.stdlib.int]
def nbytes: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("nbytes").as[me.shadaj.scalapy.stdlib.int]
def shape: /* Union[builtins.tuple[builtins.int], None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("shape").as[/* Union[builtins.tuple[builtins.int], None] */ me.shadaj.scalapy.py.Any]
def release(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("release")().as[me.shadaj.scalapy.py.None]
}

object memoryview extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("memoryview")) with py.Object {

/* attribute: contiguous */





/* attribute: suboffsets */
/* attribute: f_contiguous */
/* attribute: ndim */
/* attribute: c_contiguous */
/* attribute: format */






/* attribute: obj */
/* attribute: readonly */
/* attribute: strides */
def apply(obj : /* Union[builtins.bytes, builtins.bytearray, builtins.memoryview] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.memoryview = as[me.shadaj.scalapy.py.Dynamic].applyNamed("obj" -> obj).as[me.shadaj.scalapy.stdlib.memoryview]
/* attribute: itemsize */
/* attribute: nbytes */
/* attribute: shape */

}
@py.native trait KeyError extends me.shadaj.scalapy.stdlib.LookupError {

}

object KeyError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("KeyError")) with py.Object {

}
@py.native trait StopAsyncIteration extends me.shadaj.scalapy.stdlib.Exception {
def member_value: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("value").as[me.shadaj.scalapy.py.Any]
}

object StopAsyncIteration extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("StopAsyncIteration")) with py.Object {
/* attribute: value */
}
@py.native trait function extends me.shadaj.scalapy.stdlib.`object` {
def `__code__`: /* TypeInfo(
  Name(types.CodeType)
  Bases(builtins.object)
  Mro(types.CodeType, builtins.object)
  Names(
    __init__
    co_argcount (builtins.int)
    co_cellvars (builtins.tuple[builtins.str])
    co_code (builtins.bytes)
    co_consts (builtins.tuple[Any])
    co_filename (builtins.str)
    co_firstlineno (builtins.int)
    co_flags (builtins.int)
    co_freevars (builtins.tuple[builtins.str])
    co_kwonlyargcount (builtins.int)
    co_lnotab (builtins.bytes)
    co_name (builtins.str)
    co_names (builtins.tuple[builtins.str])
    co_nlocals (builtins.int)
    co_posonlyargcount (builtins.int)
    co_stacksize (builtins.int)
    co_varnames (builtins.tuple[builtins.str])
    replace)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__code__").as[/* TypeInfo(
  Name(types.CodeType)
  Bases(builtins.object)
  Mro(types.CodeType, builtins.object)
  Names(
    __init__
    co_argcount (builtins.int)
    co_cellvars (builtins.tuple[builtins.str])
    co_code (builtins.bytes)
    co_consts (builtins.tuple[Any])
    co_filename (builtins.str)
    co_firstlineno (builtins.int)
    co_flags (builtins.int)
    co_freevars (builtins.tuple[builtins.str])
    co_kwonlyargcount (builtins.int)
    co_lnotab (builtins.bytes)
    co_name (builtins.str)
    co_names (builtins.tuple[builtins.str])
    co_nlocals (builtins.int)
    co_posonlyargcount (builtins.int)
    co_stacksize (builtins.int)
    co_varnames (builtins.tuple[builtins.str])
    replace)) */ me.shadaj.scalapy.py.Any]
/* skip override: __annotations__ */
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
def `__qualname__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__qualname__").as[me.shadaj.scalapy.stdlib.str]
/* skip override: __module__ */
}

object function extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("function")) with py.Object {
/* attribute: __code__ */
/* attribute: __annotations__ */
/* attribute: __name__ */
/* attribute: __qualname__ */
/* attribute: __module__ */
}
@py.native trait slice extends me.shadaj.scalapy.stdlib.`object` {

def stop: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("stop").as[me.shadaj.scalapy.py.Any]
def start: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("start").as[me.shadaj.scalapy.py.Any]
/* skip override: __hash__ */
def step: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("step").as[me.shadaj.scalapy.py.Any]
def indices(len : me.shadaj.scalapy.stdlib.int): /* Tuple[builtins.int, builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("indices")("len" -> len).as[/* Tuple[builtins.int, builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any]
}

object slice extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("slice")) with py.Object {
def apply(stop : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.slice = as[me.shadaj.scalapy.py.Dynamic].applyNamed("stop" -> stop).as[me.shadaj.scalapy.stdlib.slice]
def apply(start : me.shadaj.scalapy.py.Any, stop : me.shadaj.scalapy.py.Any, step : me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.slice = as[me.shadaj.scalapy.py.Dynamic].applyNamed("start" -> start, "stop" -> stop, "step" -> step).as[me.shadaj.scalapy.stdlib.slice]
/* attribute: stop */
/* attribute: start */
/* attribute: __hash__ */
/* attribute: step */

}
@py.native trait int extends me.shadaj.scalapy.stdlib.`object` {
def __rfloordiv__(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rfloordiv__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def __index__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__index__")().as[me.shadaj.scalapy.stdlib.int]
def conjugate(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("conjugate")().as[me.shadaj.scalapy.stdlib.int]
def __rtruediv__(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rtruediv__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def __mod__(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mod__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def __ceil__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ceil__")().as[me.shadaj.scalapy.stdlib.int]
def <=(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def >(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__gt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def __pow__(__x : me.shadaj.scalapy.stdlib.int, __modulo : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__pow__")("__x" -> __x, "__modulo" -> __modulo).as[me.shadaj.scalapy.py.Any]
def __rmul__(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def __lshift__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lshift__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
def /(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__truediv__")("x" -> x).as[me.shadaj.scalapy.stdlib.float]
def bit_length(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bit_length")().as[me.shadaj.scalapy.stdlib.int]
def __rxor__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rxor__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
def __and__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__and__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
def -(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__sub__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def __floordiv__(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__floordiv__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def __radd__(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__radd__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def __getnewargs__(): /* Tuple[builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getnewargs__")().as[/* Tuple[builtins.int] */ me.shadaj.scalapy.py.Any]
/* skip override: __eq__ */
/* member: denominator */
/* skip override: __str__ */
def __bool__(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__bool__")().as[me.shadaj.scalapy.stdlib.bool]
/* member: real */
def as_integer_ratio(): /* Tuple[builtins.int, Literal[1]] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("as_integer_ratio")().as[/* Tuple[builtins.int, Literal[1]] */ me.shadaj.scalapy.py.Any]
def __int__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__int__")().as[me.shadaj.scalapy.stdlib.int]
/* member: from_bytes */
def __floor__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__floor__")().as[me.shadaj.scalapy.stdlib.int]
def __xor__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__xor__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
/* skip override: __ne__ */
def __invert__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__invert__")().as[me.shadaj.scalapy.stdlib.int]
def <(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def __rmod__(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmod__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def *(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def __neg__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__neg__")().as[me.shadaj.scalapy.stdlib.int]

def __rlshift__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rlshift__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
def __rrshift__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rrshift__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
def __rand__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rand__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
def __or__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__or__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
/* member: numerator */
def __float__(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__float__")().as[me.shadaj.scalapy.stdlib.float]
def __ror__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ror__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
def __rdivmod__(x : me.shadaj.scalapy.stdlib.int): /* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rdivmod__")("x" -> x).as[/* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any]
def __abs__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__abs__")().as[me.shadaj.scalapy.stdlib.int]
def to_bytes(length : me.shadaj.scalapy.stdlib.int, byteorder : me.shadaj.scalapy.stdlib.str, signed : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("to_bytes")("length" -> length, "byteorder" -> byteorder, "signed" -> signed).as[me.shadaj.scalapy.stdlib.bytes]
def __rpow__(x : me.shadaj.scalapy.stdlib.int, mod : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rpow__")("x" -> x, "mod" -> mod).as[me.shadaj.scalapy.py.Any]
def __pos__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__pos__")().as[me.shadaj.scalapy.stdlib.int]
def __divmod__(x : me.shadaj.scalapy.stdlib.int): /* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__divmod__")("x" -> x).as[/* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any]
def >=(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def __round__(ndigits : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__round__")("ndigits" -> ndigits).as[me.shadaj.scalapy.stdlib.int]
/* member: imag */
def +(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def __trunc__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__trunc__")().as[me.shadaj.scalapy.stdlib.int]
/* skip override: __hash__ */
def __rshift__(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rshift__")("n" -> n).as[me.shadaj.scalapy.stdlib.int]
def __rsub__(x : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rsub__")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
}

object int extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("int")) with py.Object {
  implicit def fromInt(v: Int) = (v: me.shadaj.scalapy.py.Any).as[int]
  implicit def toInt(int: int) = int.as[Int]



















/* member: denominator */


/* member: real */


/* member: from_bytes */








def apply(x : /* Union[builtins.str, builtins.bytes, typing.SupportsInt, builtins._SupportsIndex] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyNamed("x" -> x).as[me.shadaj.scalapy.stdlib.int]
def apply(x : /* Union[builtins.str, builtins.bytes, builtins.bytearray] */ me.shadaj.scalapy.py.Any, base : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyNamed("x" -> x, "base" -> base).as[me.shadaj.scalapy.stdlib.int]




/* member: numerator */










/* member: imag */





}
/* cannot compute str */
@py.native trait TypeError extends me.shadaj.scalapy.stdlib.Exception {

}

object TypeError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("TypeError")) with py.Object {

}
/* TypeVarExpr:-1(
  UpperBound(builtins.type)) */
@py.native trait FileNotFoundError extends me.shadaj.scalapy.stdlib.OSError {

}

object FileNotFoundError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FileNotFoundError")) with py.Object {

}
@py.native trait tuple[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Sequence[_T_co] {
/* skip override: count */
/* skip override: __contains__ */
def <(x : me.shadaj.scalapy.stdlib.tuple[_T_co]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __new__ */
/* skip override: __iter__ */
def *(n : me.shadaj.scalapy.stdlib.int)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.tuple[_T_co]]): me.shadaj.scalapy.stdlib.tuple[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("n" -> n).as[me.shadaj.scalapy.stdlib.tuple[_T_co]]
def <=(x : me.shadaj.scalapy.stdlib.tuple[_T_co]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __len__ */
def >(x : me.shadaj.scalapy.stdlib.tuple[_T_co]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__gt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def __rmul__(n : me.shadaj.scalapy.stdlib.int)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.tuple[_T_co]]): me.shadaj.scalapy.stdlib.tuple[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("n" -> n).as[me.shadaj.scalapy.stdlib.tuple[_T_co]]
/* skip override: __getitem__ */
/* skip override: __getitem__ */
def >=(x : me.shadaj.scalapy.stdlib.tuple[_T_co]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def +(x : me.shadaj.scalapy.stdlib.tuple[_T_co])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.tuple[_T_co]]): me.shadaj.scalapy.stdlib.tuple[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("x" -> x).as[me.shadaj.scalapy.stdlib.tuple[_T_co]]
def +(x : me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("x" -> x).as[me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.py.Any]]
/* skip override: index */
}

object tuple extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("tuple")) with py.Object {














}
@py.native trait RuntimeError extends me.shadaj.scalapy.stdlib.Exception {

}

object RuntimeError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("RuntimeError")) with py.Object {

}
def globals(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("globals")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
@py.native trait UnicodeDecodeError extends me.shadaj.scalapy.stdlib.UnicodeError {
def `object`: me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("object").as[me.shadaj.scalapy.stdlib.bytes]
def end: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("end").as[me.shadaj.scalapy.stdlib.int]
def start: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("start").as[me.shadaj.scalapy.stdlib.int]
def encoding: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("encoding").as[me.shadaj.scalapy.stdlib.str]
def reason: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("reason").as[me.shadaj.scalapy.stdlib.str]

}

object UnicodeDecodeError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("UnicodeDecodeError")) with py.Object {
/* attribute: object */
/* attribute: end */
/* attribute: start */
/* attribute: encoding */
/* attribute: reason */
def apply(__encoding : me.shadaj.scalapy.stdlib.str, __object : me.shadaj.scalapy.stdlib.bytes, __start : me.shadaj.scalapy.stdlib.int, __end : me.shadaj.scalapy.stdlib.int, __reason : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.UnicodeDecodeError = as[me.shadaj.scalapy.py.Dynamic].applyNamed("__encoding" -> __encoding, "__object" -> __object, "__start" -> __start, "__end" -> __end, "__reason" -> __reason).as[me.shadaj.scalapy.stdlib.UnicodeDecodeError]
}
@py.native trait OSError extends me.shadaj.scalapy.stdlib.Exception {
def strerror: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("strerror").as[me.shadaj.scalapy.stdlib.str]
def errno: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("errno").as[me.shadaj.scalapy.stdlib.int]
def filename: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("filename").as[me.shadaj.scalapy.py.Any]
def filename2: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("filename2").as[me.shadaj.scalapy.py.Any]
}

object OSError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("OSError")) with py.Object {
/* attribute: strerror */
/* attribute: errno */
/* attribute: filename */
/* attribute: filename2 */
}
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
/* cannot compute str */
@py.native trait GeneratorExit extends me.shadaj.scalapy.stdlib.BaseException {

}

object GeneratorExit extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("GeneratorExit")) with py.Object {

}
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait UnicodeWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object UnicodeWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("UnicodeWarning")) with py.Object {

}
@py.native trait ConnectionRefusedError extends me.shadaj.scalapy.stdlib.ConnectionError {

}

object ConnectionRefusedError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ConnectionRefusedError")) with py.Object {

}
@py.native trait _Writer extends me.shadaj.scalapy.stdlib.`object` {
def write(__s : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("write")("__s" -> __s).as[me.shadaj.scalapy.py.Any]
}

object _Writer extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_Writer")) with py.Object {

}
def exit(code : me.shadaj.scalapy.stdlib.`object`): /* <nothing> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("exit")(code).as[/* <nothing> */ me.shadaj.scalapy.py.Any]
def None: me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("None").as[me.shadaj.scalapy.py.None]
@py.native trait StopIteration extends me.shadaj.scalapy.stdlib.Exception {
def member_value: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("value").as[me.shadaj.scalapy.py.Any]
}

object StopIteration extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("StopIteration")) with py.Object {
/* attribute: value */
}
@py.native trait ZeroDivisionError extends me.shadaj.scalapy.stdlib.ArithmeticError {

}

object ZeroDivisionError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ZeroDivisionError")) with py.Object {

}
def getattr(__o : me.shadaj.scalapy.py.Any, name : me.shadaj.scalapy.stdlib.str, __default : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("getattr")(__o, name, __default).as[me.shadaj.scalapy.py.Any]
/* cannot compute str */
@py.native trait property extends me.shadaj.scalapy.stdlib.`object` {
def fset(member_value : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fset")("value" -> member_value).as[me.shadaj.scalapy.py.None]

def getter(fget : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.property = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("getter")("fget" -> fget).as[me.shadaj.scalapy.stdlib.property]
def __delete__(obj : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__delete__")("obj" -> obj).as[me.shadaj.scalapy.py.None]
def fget(): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fget")().as[me.shadaj.scalapy.py.Any]
def __set__(obj : me.shadaj.scalapy.py.Any, member_value : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__set__")("obj" -> obj, "value" -> member_value).as[me.shadaj.scalapy.py.None]
def setter(fset : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.property = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("setter")("fset" -> fset).as[me.shadaj.scalapy.stdlib.property]
def deleter(fdel : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.property = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("deleter")("fdel" -> fdel).as[me.shadaj.scalapy.stdlib.property]
def fdel(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fdel")().as[me.shadaj.scalapy.py.None]
def __get__(obj : me.shadaj.scalapy.py.Any, `type` : /* Union[builtins.type, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__get__")("obj" -> obj, "type" -> `type`).as[me.shadaj.scalapy.py.Any]
}

object property extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("property")) with py.Object {

def apply(fget : /* Union[def (Any) -> Any, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], fset : /* Union[def (Any, Any), None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], fdel : /* Union[def (Any), None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], doc : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.property = as[me.shadaj.scalapy.py.Dynamic].applyNamed("fget" -> fget, "fset" -> fset, "fdel" -> fdel, "doc" -> doc).as[me.shadaj.scalapy.stdlib.property]








}
def bin(__number : /* Union[builtins.int, builtins._SupportsIndex] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("bin")(__number).as[me.shadaj.scalapy.stdlib.str]
def `__debug__`: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__debug__").as[me.shadaj.scalapy.stdlib.bool]
@py.native trait BytesWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object BytesWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BytesWarning")) with py.Object {

}
@py.native trait WindowsError extends me.shadaj.scalapy.stdlib.OSError {
def winerror: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("winerror").as[me.shadaj.scalapy.stdlib.int]
}

object WindowsError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("WindowsError")) with py.Object {
/* attribute: winerror */
}
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait RuntimeWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object RuntimeWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("RuntimeWarning")) with py.Object {

}
@py.native trait ResourceWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object ResourceWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ResourceWarning")) with py.Object {

}
@py.native trait ArithmeticError extends me.shadaj.scalapy.stdlib.Exception {

}

object ArithmeticError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ArithmeticError")) with py.Object {

}
@py.native trait `type` extends me.shadaj.scalapy.stdlib.`object` {
def __subclasscheck__(subclass : me.shadaj.scalapy.stdlib.`type`): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__subclasscheck__")("subclass" -> subclass).as[me.shadaj.scalapy.stdlib.bool]
def `__base__`: me.shadaj.scalapy.stdlib.`type` = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__base__").as[me.shadaj.scalapy.stdlib.`type`]
/* skip override: __dict__ */
def `__flags__`: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__flags__").as[me.shadaj.scalapy.stdlib.int]
/* skip override: __new__ */
/* skip override: __new__ */
def mro(): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.`type`] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mro")().as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.`type`]]

def `__dictoffset__`: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__dictoffset__").as[me.shadaj.scalapy.stdlib.int]
def `__qualname__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__qualname__").as[me.shadaj.scalapy.stdlib.str]
/* skip override: __module__ */
def __instancecheck__(instance : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__instancecheck__")("instance" -> instance).as[me.shadaj.scalapy.stdlib.bool]
def `__bases__`: me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.stdlib.`type`] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__bases__").as[me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.stdlib.`type`]]
def `__mro__`: me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.stdlib.`type`] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__mro__").as[me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.stdlib.`type`]]
def `__weakrefoffset__`: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__weakrefoffset__").as[me.shadaj.scalapy.stdlib.int]
def __call__(args : me.shadaj.scalapy.py.Any, kwds : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__call__")("args" -> args, "kwds" -> kwds).as[me.shadaj.scalapy.py.Any]
def `__text_signature__`: /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__text_signature__").as[/* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any]
def `__basicsize__`: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__basicsize__").as[me.shadaj.scalapy.stdlib.int]
def `__itemsize__`: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__itemsize__").as[me.shadaj.scalapy.stdlib.int]
/* member: __prepare__ */
def __subclasses__[_TT <: me.shadaj.scalapy.py.Any]()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.list[_TT]]): me.shadaj.scalapy.stdlib.list[_TT] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__subclasses__")().as[me.shadaj.scalapy.stdlib.list[_TT]]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
}

object `type` extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("type")) with py.Object {

/* attribute: __base__ */
/* attribute: __dict__ */
/* attribute: __flags__ */


def apply(o : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.`type` = as[me.shadaj.scalapy.py.Dynamic].applyNamed("o" -> o).as[me.shadaj.scalapy.stdlib.`type`]
def apply(name : me.shadaj.scalapy.stdlib.str, bases : me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.stdlib.`type`], dict : me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.`type` = as[me.shadaj.scalapy.py.Dynamic].applyNamed("name" -> name, "bases" -> bases, "dict" -> dict).as[me.shadaj.scalapy.stdlib.`type`]
/* attribute: __dictoffset__ */
/* attribute: __qualname__ */
/* attribute: __module__ */

/* attribute: __bases__ */
/* attribute: __mro__ */
/* attribute: __weakrefoffset__ */

/* attribute: __text_signature__ */
/* attribute: __basicsize__ */
/* attribute: __itemsize__ */
/* member: __prepare__ */

/* attribute: __name__ */
}
@py.native trait PermissionError extends me.shadaj.scalapy.stdlib.OSError {

}

object PermissionError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("PermissionError")) with py.Object {

}
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
def breakpoint(args : me.shadaj.scalapy.py.Any, kws : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("breakpoint")(args, kws).as[me.shadaj.scalapy.py.None]
def abs[_T <: me.shadaj.scalapy.py.Any](__x : me.shadaj.scalapy.typing.SupportsAbs[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("abs")(__x).as[_T]
@py.native trait AssertionError extends me.shadaj.scalapy.stdlib.Exception {

}

object AssertionError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("AssertionError")) with py.Object {

}
/* TypeVarExpr:-1(
  Values(
    builtins.int
    builtins.float)) */
def exec(__source : /* Union[builtins.str, builtins.bytes, types.CodeType] */ me.shadaj.scalapy.py.Any, __globals : /* Union[builtins.dict[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any, __locals : /* Union[typing.Mapping[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("exec")(__source, __globals, __locals).as[me.shadaj.scalapy.py.Any]
/* <mypy.nodes.TypeAlias object at 0x7f8665addbc0> */
@py.native trait UnicodeTranslateError extends me.shadaj.scalapy.stdlib.UnicodeError {

}

object UnicodeTranslateError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("UnicodeTranslateError")) with py.Object {

}
@py.native trait UserWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object UserWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("UserWarning")) with py.Object {

}
@py.native trait ImportWarning extends me.shadaj.scalapy.stdlib.Warning {

}

object ImportWarning extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ImportWarning")) with py.Object {

}
@py.native trait SyntaxError extends me.shadaj.scalapy.stdlib.Exception {
def lineno: /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("lineno").as[/* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any]
def text: /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("text").as[/* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any]
def offset: /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("offset").as[/* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any]
def filename: /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("filename").as[/* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any]
def msg: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("msg").as[me.shadaj.scalapy.stdlib.str]
}

object SyntaxError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SyntaxError")) with py.Object {
/* attribute: lineno */
/* attribute: text */
/* attribute: offset */
/* attribute: filename */
/* attribute: msg */
}
@py.native trait LookupError extends me.shadaj.scalapy.stdlib.Exception {

}

object LookupError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LookupError")) with py.Object {

}
@py.native trait IndexError extends me.shadaj.scalapy.stdlib.LookupError {

}

object IndexError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IndexError")) with py.Object {

}
/* TypeVarExpr:-1() */
@py.native trait IsADirectoryError extends me.shadaj.scalapy.stdlib.OSError {

}

object IsADirectoryError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IsADirectoryError")) with py.Object {

}
/* cannot compute str */
@py.native trait _PathLike[AnyStr <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
def __fspath__()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[AnyStr]): AnyStr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__fspath__")().as[AnyStr]
}

object _PathLike extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_PathLike")) with py.Object {

}
def input(__prompt : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("input")(__prompt).as[me.shadaj.scalapy.stdlib.str]
/* cannot compute str */
def ord(__c : /* Union[builtins.str, builtins.bytes] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("ord")(__c).as[me.shadaj.scalapy.stdlib.int]
@py.native trait InterruptedError extends me.shadaj.scalapy.stdlib.OSError {

}

object InterruptedError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("InterruptedError")) with py.Object {

}
@py.native trait ConnectionAbortedError extends me.shadaj.scalapy.stdlib.ConnectionError {

}

object ConnectionAbortedError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ConnectionAbortedError")) with py.Object {

}
@py.native trait dict[_KT <: me.shadaj.scalapy.py.Any, _VT <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.MutableMapping[_KT, _VT] {
/* skip override: __str__ */
/* skip override: __delitem__ */
def fromkeys[_T <: me.shadaj.scalapy.py.Any](__iterable : me.shadaj.scalapy.typing.Iterable[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.dict[_T, me.shadaj.scalapy.py.Any]]): me.shadaj.scalapy.stdlib.dict[_T, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fromkeys")("__iterable" -> __iterable).as[me.shadaj.scalapy.stdlib.dict[_T, me.shadaj.scalapy.py.Any]]
def fromkeys[_T <: me.shadaj.scalapy.py.Any, _S <: me.shadaj.scalapy.py.Any](__iterable : me.shadaj.scalapy.typing.Iterable[_T], __value : _S)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.dict[_T, _S]]): me.shadaj.scalapy.stdlib.dict[_T, _S] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fromkeys")("__iterable" -> __iterable, "__value" -> __value).as[me.shadaj.scalapy.stdlib.dict[_T, _S]]
/* skip override: clear */
/* skip override: items */
/* skip override: __new__ */
/* skip override: __setitem__ */
/* skip override: __iter__ */

/* skip override: popitem */
/* skip override: __len__ */
/* skip override: __getitem__ */
/* skip override: values */
/* skip override: update */
/* skip override: update */
/* skip override: update */
def __reversed__()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Iterator[_KT]]): me.shadaj.scalapy.typing.Iterator[_KT] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__reversed__")().as[me.shadaj.scalapy.typing.Iterator[_KT]]
def copy()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.dict[_KT, _VT]]): me.shadaj.scalapy.stdlib.dict[_KT, _VT] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("copy")().as[me.shadaj.scalapy.stdlib.dict[_KT, _VT]]
/* skip override: setdefault */
/* skip override: keys */
/* skip override: __hash__ */
}

object dict extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("dict")) with py.Object {








def apply[_VT <: me.shadaj.scalapy.py.Any, _KT <: me.shadaj.scalapy.py.Any](kwargs : _VT): me.shadaj.scalapy.stdlib.dict[_KT, _VT] = as[me.shadaj.scalapy.py.Dynamic].applyNamed("kwargs" -> kwargs).as[me.shadaj.scalapy.stdlib.dict[_KT, _VT]]
def apply[_VT <: me.shadaj.scalapy.py.Any, _KT <: me.shadaj.scalapy.py.Any](map : me.shadaj.scalapy.typing.Mapping[_KT, _VT], kwargs : _VT): me.shadaj.scalapy.stdlib.dict[_KT, _VT] = as[me.shadaj.scalapy.py.Dynamic].applyNamed("map" -> map, "kwargs" -> kwargs).as[me.shadaj.scalapy.stdlib.dict[_KT, _VT]]
/* skip conflict: __init__ */









/* attribute: __hash__ */
}
@py.native trait complex extends me.shadaj.scalapy.stdlib.`object` {
def -(x : me.shadaj.scalapy.stdlib.complex): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__sub__")("x" -> x).as[me.shadaj.scalapy.stdlib.complex]
def __radd__(x : me.shadaj.scalapy.stdlib.complex): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__radd__")("x" -> x).as[me.shadaj.scalapy.stdlib.complex]
/* member: real */
def conjugate(): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("conjugate")().as[me.shadaj.scalapy.stdlib.complex]
/* skip override: __ne__ */
def __rtruediv__(x : me.shadaj.scalapy.stdlib.complex): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rtruediv__")("x" -> x).as[me.shadaj.scalapy.stdlib.complex]
def __complex__(): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__complex__")().as[me.shadaj.scalapy.stdlib.complex]
def __pow__(x : me.shadaj.scalapy.stdlib.complex, mod : me.shadaj.scalapy.py.None = null.asInstanceOf[me.shadaj.scalapy.py.None]): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__pow__")("x" -> x, "mod" -> mod).as[me.shadaj.scalapy.stdlib.complex]
def __rmul__(x : me.shadaj.scalapy.stdlib.complex): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("x" -> x).as[me.shadaj.scalapy.stdlib.complex]
def /(x : me.shadaj.scalapy.stdlib.complex): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__truediv__")("x" -> x).as[me.shadaj.scalapy.stdlib.complex]
def __abs__(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__abs__")().as[me.shadaj.scalapy.stdlib.float]
def __rpow__(x : me.shadaj.scalapy.stdlib.complex, mod : me.shadaj.scalapy.py.None = null.asInstanceOf[me.shadaj.scalapy.py.None]): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rpow__")("x" -> x, "mod" -> mod).as[me.shadaj.scalapy.stdlib.complex]
def __pos__(): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__pos__")().as[me.shadaj.scalapy.stdlib.complex]
/* skip override: __eq__ */
/* skip override: __str__ */
def __bool__(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__bool__")().as[me.shadaj.scalapy.stdlib.bool]
def *(x : me.shadaj.scalapy.stdlib.complex): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("x" -> x).as[me.shadaj.scalapy.stdlib.complex]
def __neg__(): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__neg__")().as[me.shadaj.scalapy.stdlib.complex]

/* member: imag */
def +(x : me.shadaj.scalapy.stdlib.complex): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("x" -> x).as[me.shadaj.scalapy.stdlib.complex]
/* skip override: __hash__ */
def __rsub__(x : me.shadaj.scalapy.stdlib.complex): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rsub__")("x" -> x).as[me.shadaj.scalapy.stdlib.complex]
}

object complex extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("complex")) with py.Object {


/* member: real */















def apply(real : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], imag : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float]): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyNamed("real" -> real, "imag" -> imag).as[me.shadaj.scalapy.stdlib.complex]
def apply(real : /* Union[builtins.str, typing.SupportsComplex, builtins._SupportsIndex] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.complex = as[me.shadaj.scalapy.py.Dynamic].applyNamed("real" -> real).as[me.shadaj.scalapy.stdlib.complex]
/* member: imag */



}
def len(__obj : me.shadaj.scalapy.typing.Sized): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("len")(__obj).as[me.shadaj.scalapy.stdlib.int]
@py.native trait list[_T <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.MutableSequence[_T] {
/* skip override: __contains__ */
/* skip override: clear */
def <(x : me.shadaj.scalapy.stdlib.list[_T]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __setitem__ */
/* skip override: __setitem__ */
/* skip override: __iter__ */
def <=(x : me.shadaj.scalapy.stdlib.list[_T]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
/* skip override: reverse */
/* skip override: __len__ */
/* skip override: remove */
def >(x : me.shadaj.scalapy.stdlib.list[_T]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__gt__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def __rmul__(n : me.shadaj.scalapy.stdlib.int)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.list[_T]]): me.shadaj.scalapy.stdlib.list[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("n" -> n).as[me.shadaj.scalapy.stdlib.list[_T]]
/* skip override: __getitem__ */
/* skip override: __getitem__ */
def sort(key : /* Union[def (_T`1) -> Any, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], reverse : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sort")("key" -> key, "reverse" -> reverse).as[me.shadaj.scalapy.py.None]
def >=(x : me.shadaj.scalapy.stdlib.list[_T]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("x" -> x).as[me.shadaj.scalapy.stdlib.bool]
def +(x : me.shadaj.scalapy.stdlib.list[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.list[_T]]): me.shadaj.scalapy.stdlib.list[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("x" -> x).as[me.shadaj.scalapy.stdlib.list[_T]]
/* skip override: count */
/* skip override: __str__ */
def __imul__[_S <: me.shadaj.scalapy.py.Any](n : me.shadaj.scalapy.stdlib.int)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_S]): _S = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__imul__")("n" -> n).as[_S]
/* skip override: __delitem__ */
/* skip override: insert */
/* skip override: pop */
def *(n : me.shadaj.scalapy.stdlib.int)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.list[_T]]): me.shadaj.scalapy.stdlib.list[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("n" -> n).as[me.shadaj.scalapy.stdlib.list[_T]]
/* skip override: __iadd__ */
/* skip override: extend */

/* skip override: __reversed__ */
def copy()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.list[_T]]): me.shadaj.scalapy.stdlib.list[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("copy")().as[me.shadaj.scalapy.stdlib.list[_T]]
/* skip override: index */
/* skip override: __hash__ */
/* skip override: append */
}

object list extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("list")) with py.Object {
























def apply[_T <: me.shadaj.scalapy.py.Any](): me.shadaj.scalapy.stdlib.list[_T] = as[me.shadaj.scalapy.py.Dynamic].applyNamed().as[me.shadaj.scalapy.stdlib.list[_T]]
def apply[_T <: me.shadaj.scalapy.py.Any](iterable : me.shadaj.scalapy.typing.Iterable[_T]): me.shadaj.scalapy.stdlib.list[_T] = as[me.shadaj.scalapy.py.Dynamic].applyNamed("iterable" -> iterable).as[me.shadaj.scalapy.stdlib.list[_T]]



/* attribute: __hash__ */

}
@py.native trait ProcessLookupError extends me.shadaj.scalapy.stdlib.OSError {

}

object ProcessLookupError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ProcessLookupError")) with py.Object {

}
}
