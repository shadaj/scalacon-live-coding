package me.shadaj.scalapy
import me.shadaj.scalapy.py
package object typing extends me.shadaj.scalapy.py.StaticModule("typing") {
@py.native trait ContextManager[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
def __enter__()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T_co]): _T_co = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__enter__")().as[_T_co]
def __exit__(__exc_type : /* Union[Type[builtins.BaseException], None] */ me.shadaj.scalapy.py.Any, __exc_value : /* Union[builtins.BaseException, None] */ me.shadaj.scalapy.py.Any, __traceback : /* Union[types.TracebackType, None] */ me.shadaj.scalapy.py.Any): /* Union[builtins.bool, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__exit__")("__exc_type" -> __exc_type, "__exc_value" -> __exc_value, "__traceback" -> __traceback).as[/* Union[builtins.bool, None] */ me.shadaj.scalapy.py.Any]
}

object ContextManager extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ContextManager")) with py.Object {


}
def `final`[_F <: me.shadaj.scalapy.py.Any](f : _F)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_F]): _F = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("final")(f).as[_F]
/* <mypy.nodes.TypeAlias object at 0x7f8665f66cc0> */
@py.native trait MappingView extends me.shadaj.scalapy.typing.Sized {
/* skip override: __len__ */

}

object MappingView extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MappingView")) with py.Object {

def apply[_KT_co <: me.shadaj.scalapy.py.Any, _VT_co <: me.shadaj.scalapy.py.Any](mapping : me.shadaj.scalapy.typing.Mapping[_KT_co, _VT_co]): me.shadaj.scalapy.typing.MappingView = as[me.shadaj.scalapy.py.Dynamic].applyNamed("mapping" -> mapping).as[me.shadaj.scalapy.typing.MappingView]
}
/* <mypy.nodes.TypeAlias object at 0x7f8665f66640> */
/* TypeVarExpr:-1() */
def TypedDict: me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("TypedDict").as[me.shadaj.scalapy.stdlib.`object`]
/* TypeVarExpr:-1(
  UpperBound(def (*Any, **Any) -> Any)) */
def get_type_hints(obj : me.shadaj.scalapy.py.Any, globalns : /* Union[builtins.dict[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any, localns : /* Union[builtins.dict[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_type_hints")(obj, globalns, localns).as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
@py.native trait AbstractSet[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Collection[_T_co] {
/* member: __contains__ */
def <=(s : me.shadaj.scalapy.typing.AbstractSet[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("s" -> s).as[me.shadaj.scalapy.stdlib.bool]
def __or__[_T <: me.shadaj.scalapy.py.Any](s : me.shadaj.scalapy.typing.AbstractSet[_T]): me.shadaj.scalapy.typing.AbstractSet[/* Union[_T_co`1, _T`-1] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__or__")("s" -> s).as[me.shadaj.scalapy.typing.AbstractSet[/* Union[_T_co`1, _T`-1] */ me.shadaj.scalapy.py.Any]]
def >(s : me.shadaj.scalapy.typing.AbstractSet[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__gt__")("s" -> s).as[me.shadaj.scalapy.stdlib.bool]
def isdisjoint(s : me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isdisjoint")("s" -> s).as[me.shadaj.scalapy.stdlib.bool]
def >=(s : me.shadaj.scalapy.typing.AbstractSet[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("s" -> s).as[me.shadaj.scalapy.stdlib.bool]
def __and__(s : me.shadaj.scalapy.typing.AbstractSet[me.shadaj.scalapy.py.Any])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.AbstractSet[_T_co]]): me.shadaj.scalapy.typing.AbstractSet[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__and__")("s" -> s).as[me.shadaj.scalapy.typing.AbstractSet[_T_co]]
def -(s : me.shadaj.scalapy.typing.AbstractSet[me.shadaj.scalapy.py.Any])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.AbstractSet[_T_co]]): me.shadaj.scalapy.typing.AbstractSet[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__sub__")("s" -> s).as[me.shadaj.scalapy.typing.AbstractSet[_T_co]]
def __xor__[_T <: me.shadaj.scalapy.py.Any](s : me.shadaj.scalapy.typing.AbstractSet[_T]): me.shadaj.scalapy.typing.AbstractSet[/* Union[_T_co`1, _T`-1] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__xor__")("s" -> s).as[me.shadaj.scalapy.typing.AbstractSet[/* Union[_T_co`1, _T`-1] */ me.shadaj.scalapy.py.Any]]
def <(s : me.shadaj.scalapy.typing.AbstractSet[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("s" -> s).as[me.shadaj.scalapy.stdlib.bool]
}

object AbstractSet extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("AbstractSet")) with py.Object {
/* member: __contains__ */









}
@py.native trait Generator[_T_co <: me.shadaj.scalapy.py.Any, _T_contra <: me.shadaj.scalapy.py.Any, _V_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Iterator[_T_co] {
/* member: gi_frame */
/* member: gi_running */
/* member: send */
/* member: __iter__ */
/* member: __next__ */
/* member: gi_code */
/* member: gi_yieldfrom */
/* member: close */
/* member: throw */
}

object Generator extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Generator")) with py.Object {
/* member: gi_frame */
/* member: gi_running */
/* member: send */
/* member: __iter__ */
/* member: __next__ */
/* member: gi_code */
/* member: gi_yieldfrom */
/* member: close */
/* member: throw */
}
@py.native trait SupportsIndex extends me.shadaj.scalapy.stdlib.`object` {
/* member: __index__ */
}

object SupportsIndex extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SupportsIndex")) with py.Object {
/* member: __index__ */
}
/* TypeVarExpr:-1(
  Variance(COVARIANT)) */
@py.native trait Pattern[AnyStr <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
def subn(repl : AnyStr, string : AnyStr, count : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): /* Tuple[AnyStr`1, builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("subn")("repl" -> repl, "string" -> string, "count" -> count).as[/* Tuple[AnyStr`1, builtins.int] */ me.shadaj.scalapy.py.Any]
/* skip conflict: subn */
def pattern(implicit retReader: me.shadaj.scalapy.readwrite.Reader[AnyStr]): AnyStr = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("pattern").as[AnyStr]
def flags: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("flags").as[me.shadaj.scalapy.stdlib.int]
def groups: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("groups").as[me.shadaj.scalapy.stdlib.int]
def finditer(string : AnyStr, pos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], endpos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Iterator[me.shadaj.scalapy.typing.Match[AnyStr]]]): me.shadaj.scalapy.typing.Iterator[me.shadaj.scalapy.typing.Match[AnyStr]] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("finditer")("string" -> string, "pos" -> pos, "endpos" -> endpos).as[me.shadaj.scalapy.typing.Iterator[me.shadaj.scalapy.typing.Match[AnyStr]]]
def `match`(string : AnyStr, pos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], endpos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): /* Union[typing.Match[AnyStr`1], None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("match")("string" -> string, "pos" -> pos, "endpos" -> endpos).as[/* Union[typing.Match[AnyStr`1], None] */ me.shadaj.scalapy.py.Any]
def split(string : AnyStr, maxsplit : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.list[AnyStr]]): me.shadaj.scalapy.stdlib.list[AnyStr] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("split")("string" -> string, "maxsplit" -> maxsplit).as[me.shadaj.scalapy.stdlib.list[AnyStr]]
def sub(repl : AnyStr, string : AnyStr, count : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[AnyStr]): AnyStr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sub")("repl" -> repl, "string" -> string, "count" -> count).as[AnyStr]
/* skip conflict: sub */
def findall(string : AnyStr, pos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], endpos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("findall")("string" -> string, "pos" -> pos, "endpos" -> endpos).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.py.Any]]
def search(string : AnyStr, pos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], endpos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): /* Union[typing.Match[AnyStr`1], None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("search")("string" -> string, "pos" -> pos, "endpos" -> endpos).as[/* Union[typing.Match[AnyStr`1], None] */ me.shadaj.scalapy.py.Any]
def fullmatch(string : AnyStr, pos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], endpos : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): /* Union[typing.Match[AnyStr`1], None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fullmatch")("string" -> string, "pos" -> pos, "endpos" -> endpos).as[/* Union[typing.Match[AnyStr`1], None] */ me.shadaj.scalapy.py.Any]
def groupindex: me.shadaj.scalapy.typing.Mapping[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.stdlib.int] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("groupindex").as[me.shadaj.scalapy.typing.Mapping[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.stdlib.int]]
}

object Pattern extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Pattern")) with py.Object {

/* attribute: pattern */
/* attribute: flags */
/* attribute: groups */







/* attribute: groupindex */
}
/* <mypy.nodes.TypeAlias object at 0x7f86661aa9c0> */
@py.native trait MutableMapping[_KT <: me.shadaj.scalapy.py.Any, _VT <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Mapping[_KT, _VT] {
/* member: __delitem__ */
def pop(k : _KT)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_VT]): _VT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pop")("k" -> k).as[_VT]
def pop(k : _KT, default : /* Union[_VT`2, _T`-1] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): /* Union[_VT`2, _T`-1] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pop")("k" -> k, "default" -> default).as[/* Union[_VT`2, _T`-1] */ me.shadaj.scalapy.py.Any]
def clear(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clear")().as[me.shadaj.scalapy.py.None]
/* member: __setitem__ */
def popitem(): /* Tuple[_KT`1, _VT`2] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("popitem")().as[/* Tuple[_KT`1, _VT`2] */ me.shadaj.scalapy.py.Any]
def setdefault(k : _KT, default : _VT = null.asInstanceOf[_VT])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_VT]): _VT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("setdefault")("k" -> k, "default" -> default).as[_VT]
def update(__m : me.shadaj.scalapy.typing.Mapping[_KT, _VT], kwargs : _VT): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("update")("__m" -> __m, "kwargs" -> kwargs).as[me.shadaj.scalapy.py.None]
/* skip conflict: update */
def update(kwargs : _VT): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("update")("kwargs" -> kwargs).as[me.shadaj.scalapy.py.None]
}

object MutableMapping extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MutableMapping")) with py.Object {
/* member: __delitem__ */


/* member: __setitem__ */



}
/* TypeVarExpr:-1() */
@py.native trait Iterable[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
/* member: __iter__ */
}

object Iterable extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Iterable")) with py.Object {
/* member: __iter__ */
}
def get_origin(tp : me.shadaj.scalapy.py.Any): /* Union[Any, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_origin")(tp).as[/* Union[Any, None] */ me.shadaj.scalapy.py.Any]
@py.native trait _Alias extends me.shadaj.scalapy.stdlib.`object` {
def __getitem__(typeargs : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getitem__")("typeargs" -> typeargs).as[me.shadaj.scalapy.py.Any]
}

object _Alias extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_Alias")) with py.Object {

}
/* <mypy.nodes.TypeAlias object at 0x7f86661aaa40> */
def Optional: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Optional").as[me.shadaj.scalapy.typing._SpecialForm]
/* TypeVarExpr:-1() */
def OrderedDict: me.shadaj.scalapy.typing._Alias = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("OrderedDict").as[me.shadaj.scalapy.typing._Alias]
@py.native trait Collection[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Iterable[_T_co] with me.shadaj.scalapy.typing.Container[_T_co] {
/* member: __len__ */
}

object Collection extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Collection")) with py.Object {
/* member: __len__ */
}
@py.native trait Iterator[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Iterable[_T_co] {
/* skip override: __iter__ */
/* member: __next__ */
}

object Iterator extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Iterator")) with py.Object {

/* member: __next__ */
}
@py.native trait SupportsInt extends me.shadaj.scalapy.stdlib.`object` {
/* member: __int__ */
}

object SupportsInt extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SupportsInt")) with py.Object {
/* member: __int__ */
}
@py.native trait MutableSequence[_T <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Sequence[_T] {
def __delitem__(i : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__delitem__")("i" -> i).as[me.shadaj.scalapy.py.None]
/* skip conflict: __delitem__ */
def clear(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clear")().as[me.shadaj.scalapy.py.None]
def __setitem__(i : me.shadaj.scalapy.stdlib.int, o : _T): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__setitem__")("i" -> i, "o" -> o).as[me.shadaj.scalapy.py.None]
/* skip conflict: __setitem__ */
def reverse(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("reverse")().as[me.shadaj.scalapy.py.None]
def remove(`object` : _T): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("remove")("object" -> `object`).as[me.shadaj.scalapy.py.None]
/* skip override: __getitem__ */
/* skip override: __getitem__ */
def append(`object` : _T): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("append")("object" -> `object`).as[me.shadaj.scalapy.py.None]
/* member: insert */
def pop(index : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pop")("index" -> index).as[_T]
def __iadd__(x : me.shadaj.scalapy.typing.Iterable[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.MutableSequence[_T]]): me.shadaj.scalapy.typing.MutableSequence[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iadd__")("x" -> x).as[me.shadaj.scalapy.typing.MutableSequence[_T]]
def extend(iterable : me.shadaj.scalapy.typing.Iterable[_T]): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("extend")("iterable" -> iterable).as[me.shadaj.scalapy.py.None]
}

object MutableSequence extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MutableSequence")) with py.Object {







/* member: insert */



}
/* TypeVarExpr:-1(
  UpperBound(Type[builtins.object])) */
def overload: me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("overload").as[me.shadaj.scalapy.stdlib.`object`]
@py.native trait SupportsRound[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
def __round__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__round__")().as[me.shadaj.scalapy.stdlib.int]
def __round__(ndigits : me.shadaj.scalapy.stdlib.int)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T_co]): _T_co = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__round__")("ndigits" -> ndigits).as[_T_co]
}

object SupportsRound extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SupportsRound")) with py.Object {

}
@py.native trait AwaitableGenerator[_T_co <: me.shadaj.scalapy.py.Any, _T_contra <: me.shadaj.scalapy.py.Any, _V_co <: me.shadaj.scalapy.py.Any, _S <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Awaitable[_V_co] with me.shadaj.scalapy.typing.Generator[_T_co, _T_contra, _V_co] {

}

object AwaitableGenerator extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("AwaitableGenerator")) with py.Object {

}
def Literal: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Literal").as[me.shadaj.scalapy.typing._SpecialForm]
@py.native trait MutableSet[_T <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.AbstractSet[_T] {
def pop()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pop")().as[_T]
def clear(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clear")().as[me.shadaj.scalapy.py.None]
def __isub__(s : me.shadaj.scalapy.typing.AbstractSet[me.shadaj.scalapy.py.Any])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.MutableSet[_T]]): me.shadaj.scalapy.typing.MutableSet[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__isub__")("s" -> s).as[me.shadaj.scalapy.typing.MutableSet[_T]]
/* member: discard */
def __ixor__[_S <: me.shadaj.scalapy.py.Any](s : me.shadaj.scalapy.typing.AbstractSet[_S]): me.shadaj.scalapy.typing.MutableSet[/* Union[_T`1, _S`-1] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ixor__")("s" -> s).as[me.shadaj.scalapy.typing.MutableSet[/* Union[_T`1, _S`-1] */ me.shadaj.scalapy.py.Any]]
def remove(element : _T): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("remove")("element" -> element).as[me.shadaj.scalapy.py.None]
def __ior__[_S <: me.shadaj.scalapy.py.Any](s : me.shadaj.scalapy.typing.AbstractSet[_S]): me.shadaj.scalapy.typing.MutableSet[/* Union[_T`1, _S`-1] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ior__")("s" -> s).as[me.shadaj.scalapy.typing.MutableSet[/* Union[_T`1, _S`-1] */ me.shadaj.scalapy.py.Any]]
def __iand__(s : me.shadaj.scalapy.typing.AbstractSet[me.shadaj.scalapy.py.Any])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.MutableSet[_T]]): me.shadaj.scalapy.typing.MutableSet[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iand__")("s" -> s).as[me.shadaj.scalapy.typing.MutableSet[_T]]
/* member: add */
}

object MutableSet extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MutableSet")) with py.Object {



/* member: discard */




/* member: add */
}
def _promote: me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_promote").as[me.shadaj.scalapy.stdlib.`object`]
/* TypeVarExpr:-1() */
def TypeVar: me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("TypeVar").as[me.shadaj.scalapy.stdlib.`object`]
@py.native trait Sequence[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Collection[_T_co] with me.shadaj.scalapy.typing.Reversible[_T_co] {
def count(x : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("count")("x" -> x).as[me.shadaj.scalapy.stdlib.int]
/* skip override: __contains__ */
/* skip override: __iter__ */
def __getitem__(i : me.shadaj.scalapy.stdlib.int)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T_co]): _T_co = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getitem__")("i" -> i).as[_T_co]
def __getitem__(s : me.shadaj.scalapy.stdlib.slice)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Sequence[_T_co]]): me.shadaj.scalapy.typing.Sequence[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getitem__")("s" -> s).as[me.shadaj.scalapy.typing.Sequence[_T_co]]
/* skip override: __reversed__ */
def index(x : me.shadaj.scalapy.py.Any, start : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], end : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index")("x" -> x, "start" -> start, "end" -> end).as[me.shadaj.scalapy.stdlib.int]
}

object Sequence extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Sequence")) with py.Object {






}
/* <mypy.nodes.TypeAlias object at 0x7f86661aabc0> */
@py.native trait SupportsComplex extends me.shadaj.scalapy.stdlib.`object` {
/* member: __complex__ */
}

object SupportsComplex extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SupportsComplex")) with py.Object {
/* member: __complex__ */
}
/* <mypy.nodes.TypeAlias object at 0x7f8665f66440> */
@py.native trait KeysView[_KT_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.MappingView with me.shadaj.scalapy.typing.AbstractSet[_KT_co] {
/* skip override: __contains__ */
/* skip override: __xor__ */
/* skip override: __iter__ */

def __ror__[_T <: me.shadaj.scalapy.py.Any](o : me.shadaj.scalapy.typing.Iterable[_T]): me.shadaj.scalapy.stdlib.set[/* Union[_KT_co`1, _T`-1] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ror__")("o" -> o).as[me.shadaj.scalapy.stdlib.set[/* Union[_KT_co`1, _T`-1] */ me.shadaj.scalapy.py.Any]]
def __reversed__()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Iterator[_KT_co]]): me.shadaj.scalapy.typing.Iterator[_KT_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__reversed__")().as[me.shadaj.scalapy.typing.Iterator[_KT_co]]
def __rxor__[_T <: me.shadaj.scalapy.py.Any](o : me.shadaj.scalapy.typing.Iterable[_T]): me.shadaj.scalapy.stdlib.set[/* Union[_KT_co`1, _T`-1] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rxor__")("o" -> o).as[me.shadaj.scalapy.stdlib.set[/* Union[_KT_co`1, _T`-1] */ me.shadaj.scalapy.py.Any]]
def __rsub__[_T <: me.shadaj.scalapy.py.Any](o : me.shadaj.scalapy.typing.Iterable[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.set[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rsub__")("o" -> o).as[me.shadaj.scalapy.stdlib.set[_T]]
/* skip override: __and__ */
/* skip override: __sub__ */
def __rand__[_T <: me.shadaj.scalapy.py.Any](o : me.shadaj.scalapy.typing.Iterable[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.set[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rand__")("o" -> o).as[me.shadaj.scalapy.stdlib.set[_T]]
/* skip override: __or__ */
}

object KeysView extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("KeysView")) with py.Object {



def apply[_KT_co <: me.shadaj.scalapy.py.Any, _VT_co <: me.shadaj.scalapy.py.Any](mapping : me.shadaj.scalapy.typing.Mapping[_KT_co, _VT_co]): me.shadaj.scalapy.typing.KeysView[_KT_co] = as[me.shadaj.scalapy.py.Dynamic].applyNamed("mapping" -> mapping).as[me.shadaj.scalapy.typing.KeysView[_KT_co]]








}
@py.native trait Hashable extends me.shadaj.scalapy.stdlib.`object` {
/* member: __hash__ */
}

object Hashable extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Hashable")) with py.Object {
/* member: __hash__ */
}
@py.native trait NamedTuple extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.py.Any] {
/* member: _make */
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
def _field_types: /* TypeInfo(
  Name(collections.OrderedDict)
  Bases(builtins.dict[_KT`1, _VT`2], typing.Reversible[_KT`1])
  Mro(collections.OrderedDict, builtins.dict, typing.MutableMapping, typing.Mapping, typing.Collection, typing.Iterable, typing.Container, typing.Reversible, builtins.object)
  Names(
    __reversed__
    copy
    items
    keys
    move_to_end
    popitem
    values)
  MetaclassType(abc.ABCMeta)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[/* TypeInfo(
  Name(collections.OrderedDict)
  Bases(builtins.dict[_KT`1, _VT`2], typing.Reversible[_KT`1])
  Mro(collections.OrderedDict, builtins.dict, typing.MutableMapping, typing.Mapping, typing.Collection, typing.Iterable, typing.Container, typing.Reversible, builtins.object)
  Names(
    __reversed__
    copy
    items
    keys
    move_to_end
    popitem
    values)
  MetaclassType(abc.ABCMeta)) */ me.shadaj.scalapy.py.Any]

def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
def _replace[_T <: me.shadaj.scalapy.py.Any](kwargs : me.shadaj.scalapy.py.Any)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("kwargs" -> kwargs).as[_T]
def _fields: me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.stdlib.str]]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
}

object NamedTuple extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("NamedTuple")) with py.Object {
/* member: _make */
/* attribute: _field_defaults */
/* attribute: _field_types */
def apply(typename : me.shadaj.scalapy.stdlib.str, fields : me.shadaj.scalapy.typing.Iterable[/* Tuple[builtins.str, Any] */ me.shadaj.scalapy.py.Any] = null.asInstanceOf[me.shadaj.scalapy.typing.Iterable[me.shadaj.scalapy.py.Any]], kwargs : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.typing.NamedTuple = as[me.shadaj.scalapy.py.Dynamic].applyNamed("typename" -> typename, "fields" -> fields, "kwargs" -> kwargs).as[me.shadaj.scalapy.typing.NamedTuple]


/* attribute: _fields */
/* attribute: _source */
}
def no_type_check_decorator[_C <: me.shadaj.scalapy.py.Any](decorator : _C)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_C]): _C = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("no_type_check_decorator")(decorator).as[_C]
@py.native trait Mapping[_KT <: me.shadaj.scalapy.py.Any, _VT_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Collection[_KT] {
/* skip override: __contains__ */
def items(): me.shadaj.scalapy.typing.AbstractSet[/* Tuple[_KT`1, _VT_co`2] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("items")().as[me.shadaj.scalapy.typing.AbstractSet[/* Tuple[_KT`1, _VT_co`2] */ me.shadaj.scalapy.py.Any]]
/* member: __getitem__ */
def values()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.ValuesView[_VT_co]]): me.shadaj.scalapy.typing.ValuesView[_VT_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("values")().as[me.shadaj.scalapy.typing.ValuesView[_VT_co]]
def get(k : _KT): /* Union[_VT_co`2, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("get")("k" -> k).as[/* Union[_VT_co`2, None] */ me.shadaj.scalapy.py.Any]
def get(k : _KT, default : /* Union[_VT_co`2, _T`-1] */ me.shadaj.scalapy.py.Any): /* Union[_VT_co`2, _T`-1] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("get")("k" -> k, "default" -> default).as[/* Union[_VT_co`2, _T`-1] */ me.shadaj.scalapy.py.Any]
def keys()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.AbstractSet[_KT]]): me.shadaj.scalapy.typing.AbstractSet[_KT] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("keys")().as[me.shadaj.scalapy.typing.AbstractSet[_KT]]
}

object Mapping extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Mapping")) with py.Object {


/* member: __getitem__ */



}
/* TypeVarExpr:-1(
  Variance(COVARIANT)) */
/* TypeVarExpr:-1(
  Values(
    builtins.str
    builtins.bytes)) */
@py.native trait Awaitable[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
/* member: __await__ */
}

object Awaitable extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Awaitable")) with py.Object {
/* member: __await__ */
}
@py.native trait AsyncIterator[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.AsyncIterable[_T_co] {
/* skip override: __aiter__ */
/* member: __anext__ */
}

object AsyncIterator extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("AsyncIterator")) with py.Object {

/* member: __anext__ */
}
@py.native trait Sized extends me.shadaj.scalapy.stdlib.`object` {
/* member: __len__ */
}

object Sized extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Sized")) with py.Object {
/* member: __len__ */
}
/* TypeVarExpr:-1(
  Variance(CONTRAVARIANT)) */
@py.native trait Container[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
/* member: __contains__ */
}

object Container extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Container")) with py.Object {
/* member: __contains__ */
}
@py.native trait BinaryIO extends me.shadaj.scalapy.typing.IO[me.shadaj.scalapy.stdlib.bytes] {
/* member: __enter__ */
/* skip override: write */
/* skip override: write */
}

object BinaryIO extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BinaryIO")) with py.Object {
/* member: __enter__ */

}
@py.native trait SupportsFloat extends me.shadaj.scalapy.stdlib.`object` {
/* member: __float__ */
}

object SupportsFloat extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SupportsFloat")) with py.Object {
/* member: __float__ */
}
def Tuple: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Tuple").as[me.shadaj.scalapy.typing._SpecialForm]
/* cannot compute str */
def NewType(name : me.shadaj.scalapy.stdlib.str, tp : /* Type[_T`-1] */ me.shadaj.scalapy.py.Any): /* Type[_T`-1] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("NewType")(name, tp).as[/* Type[_T`-1] */ me.shadaj.scalapy.py.Any]
@py.native trait _SpecialForm extends me.shadaj.scalapy.stdlib.`object` {
def __getitem__(typeargs : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getitem__")("typeargs" -> typeargs).as[me.shadaj.scalapy.stdlib.`object`]
}

object _SpecialForm extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_SpecialForm")) with py.Object {

}
@py.native trait TextIO extends me.shadaj.scalapy.typing.IO[me.shadaj.scalapy.stdlib.str] {
/* member: line_buffering */
/* member: __enter__ */
/* member: encoding */
/* member: newlines */
/* member: buffer */
/* member: errors */
}

object TextIO extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("TextIO")) with py.Object {
/* member: line_buffering */
/* member: __enter__ */
/* member: encoding */
/* member: newlines */
/* member: buffer */
/* member: errors */
}
@py.native trait SupportsAbs[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
/* member: __abs__ */
}

object SupportsAbs extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SupportsAbs")) with py.Object {
/* member: __abs__ */
}
@py.native trait ByteString extends me.shadaj.scalapy.typing.Sequence[me.shadaj.scalapy.stdlib.int] {

}

object ByteString extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ByteString")) with py.Object {

}
/* <mypy.nodes.TypeAlias object at 0x7f8665f66ac0> */
def type_check_only[_C <: me.shadaj.scalapy.py.Any](func_or_cls : _C)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_C]): _C = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("type_check_only")(func_or_cls).as[_C]
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait ItemsView[_KT_co <: me.shadaj.scalapy.py.Any, _VT_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.MappingView with me.shadaj.scalapy.typing.AbstractSet[/* Tuple[_KT_co`1, _VT_co`2] */ me.shadaj.scalapy.py.Any] {
/* skip override: __contains__ */
/* skip override: __xor__ */
/* skip override: __iter__ */

def __ror__[_T <: me.shadaj.scalapy.py.Any](o : me.shadaj.scalapy.typing.Iterable[_T]): me.shadaj.scalapy.stdlib.set[/* Union[Tuple[_KT_co`1, _VT_co`2], _T`-1] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ror__")("o" -> o).as[me.shadaj.scalapy.stdlib.set[/* Union[Tuple[_KT_co`1, _VT_co`2], _T`-1] */ me.shadaj.scalapy.py.Any]]
def __reversed__(): me.shadaj.scalapy.typing.Iterator[/* Tuple[_KT_co`1, _VT_co`2] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__reversed__")().as[me.shadaj.scalapy.typing.Iterator[/* Tuple[_KT_co`1, _VT_co`2] */ me.shadaj.scalapy.py.Any]]
def __rxor__[_T <: me.shadaj.scalapy.py.Any](o : me.shadaj.scalapy.typing.Iterable[_T]): me.shadaj.scalapy.stdlib.set[/* Union[Tuple[_KT_co`1, _VT_co`2], _T`-1] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rxor__")("o" -> o).as[me.shadaj.scalapy.stdlib.set[/* Union[Tuple[_KT_co`1, _VT_co`2], _T`-1] */ me.shadaj.scalapy.py.Any]]
def __rsub__[_T <: me.shadaj.scalapy.py.Any](o : me.shadaj.scalapy.typing.Iterable[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.set[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rsub__")("o" -> o).as[me.shadaj.scalapy.stdlib.set[_T]]
/* skip override: __and__ */
/* skip override: __sub__ */
def __rand__[_T <: me.shadaj.scalapy.py.Any](o : me.shadaj.scalapy.typing.Iterable[_T])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.set[_T]]): me.shadaj.scalapy.stdlib.set[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rand__")("o" -> o).as[me.shadaj.scalapy.stdlib.set[_T]]
/* skip override: __or__ */
}

object ItemsView extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ItemsView")) with py.Object {



def apply[_KT_co <: me.shadaj.scalapy.py.Any, _VT_co <: me.shadaj.scalapy.py.Any](mapping : me.shadaj.scalapy.typing.Mapping[_KT_co, _VT_co]): me.shadaj.scalapy.typing.ItemsView[_KT_co, _VT_co] = as[me.shadaj.scalapy.py.Dynamic].applyNamed("mapping" -> mapping).as[me.shadaj.scalapy.typing.ItemsView[_KT_co, _VT_co]]








}
@py.native trait Reversible[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
/* member: __reversed__ */
}

object Reversible extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Reversible")) with py.Object {
/* member: __reversed__ */
}
def runtime_checkable[_TC <: me.shadaj.scalapy.py.Any](cls : _TC)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_TC]): _TC = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("runtime_checkable")(cls).as[_TC]
def Final: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Final").as[me.shadaj.scalapy.typing._SpecialForm]
@py.native trait SupportsBytes extends me.shadaj.scalapy.stdlib.`object` {
/* member: __bytes__ */
}

object SupportsBytes extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SupportsBytes")) with py.Object {
/* member: __bytes__ */
}
@py.native trait ValuesView[_VT_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.MappingView with me.shadaj.scalapy.typing.Iterable[_VT_co] {
/* skip override: __iter__ */
def __reversed__()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Iterator[_VT_co]]): me.shadaj.scalapy.typing.Iterator[_VT_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__reversed__")().as[me.shadaj.scalapy.typing.Iterator[_VT_co]]

def __contains__(o : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__contains__")("o" -> o).as[me.shadaj.scalapy.stdlib.bool]
}

object ValuesView extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ValuesView")) with py.Object {


def apply[_KT_co <: me.shadaj.scalapy.py.Any, _VT_co <: me.shadaj.scalapy.py.Any](mapping : me.shadaj.scalapy.typing.Mapping[_KT_co, _VT_co]): me.shadaj.scalapy.typing.ValuesView[_VT_co] = as[me.shadaj.scalapy.py.Dynamic].applyNamed("mapping" -> mapping).as[me.shadaj.scalapy.typing.ValuesView[_VT_co]]

}
/* <mypy.nodes.TypeAlias object at 0x7f86661aa6c0> */
def ClassVar: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ClassVar").as[me.shadaj.scalapy.typing._SpecialForm]
def get_args(tp : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_args")(tp).as[me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.py.Any]]
@py.native trait IO[AnyStr <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Iterator[AnyStr] {
/* member: read */
/* member: name */
/* member: isatty */
/* member: closed */
/* member: seek */
/* member: __enter__ */
/* member: flush */
/* member: __exit__ */
/* member: close */
/* member: tell */
/* member: writable */
/* member: truncate */
/* member: writelines */
/* member: __iter__ */
/* member: __next__ */
/* member: seekable */
/* member: mode */
/* member: fileno */
/* member: readlines */
/* member: readline */
/* member: write */
/* member: readable */
}

object IO extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IO")) with py.Object {
/* member: read */
/* member: name */
/* member: isatty */
/* member: closed */
/* member: seek */
/* member: __enter__ */
/* member: flush */
/* member: __exit__ */
/* member: close */
/* member: tell */
/* member: writable */
/* member: truncate */
/* member: writelines */
/* member: __iter__ */
/* member: __next__ */
/* member: seekable */
/* member: mode */
/* member: fileno */
/* member: readlines */
/* member: readline */
/* member: write */
/* member: readable */
}
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
def TYPE_CHECKING: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("TYPE_CHECKING").as[me.shadaj.scalapy.stdlib.bool]
@py.native trait Coroutine[_T_co <: me.shadaj.scalapy.py.Any, _T_contra <: me.shadaj.scalapy.py.Any, _V_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.Awaitable[_V_co] {
/* member: cr_await */
/* member: cr_frame */
/* member: send */
/* member: cr_code */
/* member: cr_running */
/* member: close */
/* member: throw */
}

object Coroutine extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Coroutine")) with py.Object {
/* member: cr_await */
/* member: cr_frame */
/* member: send */
/* member: cr_code */
/* member: cr_running */
/* member: close */
/* member: throw */
}
def Protocol: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Protocol").as[me.shadaj.scalapy.typing._SpecialForm]
def no_type_check: me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("no_type_check").as[me.shadaj.scalapy.stdlib.`object`]
def Union: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Union").as[me.shadaj.scalapy.typing._SpecialForm]
/* <mypy.nodes.TypeAlias object at 0x7f86661aa940> */
@py.native trait _TypedDict extends me.shadaj.scalapy.typing.Mapping[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.stdlib.`object`] {
def __delitem__(k : /* <nothing> */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__delitem__")("k" -> k).as[me.shadaj.scalapy.py.None]
def pop[_T <: me.shadaj.scalapy.py.Any](k : /* <nothing> */ me.shadaj.scalapy.py.Any, default : _T = null.asInstanceOf[_T]): me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pop")("k" -> k, "default" -> default).as[me.shadaj.scalapy.stdlib.`object`]
/* skip override: items */
/* skip override: values */
def update[_T <: me.shadaj.scalapy.py.Any](__m : _T): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("update")("__m" -> __m).as[me.shadaj.scalapy.py.None]
/* skip override: keys */
def copy[_T <: me.shadaj.scalapy.py.Any]()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("copy")().as[_T]
def setdefault(k : /* <nothing> */ me.shadaj.scalapy.py.Any, default : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("setdefault")("k" -> k, "default" -> default).as[me.shadaj.scalapy.stdlib.`object`]
}

object _TypedDict extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_TypedDict")) with py.Object {








}
/* <mypy.nodes.TypeAlias object at 0x7f8665f66040> */
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait AsyncGenerator[_T_co <: me.shadaj.scalapy.py.Any, _T_contra <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.typing.AsyncIterator[_T_co] {
/* member: ag_frame */
/* member: __aiter__ */
/* member: athrow */
/* member: ag_running */
/* member: ag_await */
/* member: aclose */
/* member: __anext__ */
/* member: ag_code */
/* member: asend */
}

object AsyncGenerator extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("AsyncGenerator")) with py.Object {
/* member: ag_frame */
/* member: __aiter__ */
/* member: athrow */
/* member: ag_running */
/* member: ag_await */
/* member: aclose */
/* member: __anext__ */
/* member: ag_code */
/* member: asend */
}
@py.native trait Match[AnyStr <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
/* member: regs */
def re(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Pattern[AnyStr]]): me.shadaj.scalapy.typing.Pattern[AnyStr] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("re").as[me.shadaj.scalapy.typing.Pattern[AnyStr]]
def string(implicit retReader: me.shadaj.scalapy.readwrite.Reader[AnyStr]): AnyStr = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("string").as[AnyStr]
def groups(default : AnyStr = null.asInstanceOf[AnyStr])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Sequence[AnyStr]]): me.shadaj.scalapy.typing.Sequence[AnyStr] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("groups")("default" -> default).as[me.shadaj.scalapy.typing.Sequence[AnyStr]]
def endpos: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("endpos").as[me.shadaj.scalapy.stdlib.int]
def expand(template : AnyStr)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[AnyStr]): AnyStr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("expand")("template" -> template).as[AnyStr]
def __getitem__(g : /* Union[builtins.int, builtins.str] */ me.shadaj.scalapy.py.Any)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[AnyStr]): AnyStr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getitem__")("g" -> g).as[AnyStr]
def end(__group : /* Union[builtins.int, builtins.str] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("end")("__group" -> __group).as[me.shadaj.scalapy.stdlib.int]
def start(__group : /* Union[builtins.int, builtins.str] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("start")("__group" -> __group).as[me.shadaj.scalapy.stdlib.int]
def group(__group : /* Union[builtins.str, builtins.int] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[AnyStr]): AnyStr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("group")("__group" -> __group).as[AnyStr]
def group(__group1 : /* Union[builtins.str, builtins.int] */ me.shadaj.scalapy.py.Any, __group2 : /* Union[builtins.str, builtins.int] */ me.shadaj.scalapy.py.Any, groups : /* Union[builtins.str, builtins.int] */ me.shadaj.scalapy.py.Any)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.tuple[AnyStr]]): me.shadaj.scalapy.stdlib.tuple[AnyStr] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("group")("__group1" -> __group1, "__group2" -> __group2, "groups" -> groups).as[me.shadaj.scalapy.stdlib.tuple[AnyStr]]
def lastgroup: /* Union[AnyStr`1, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("lastgroup").as[/* Union[AnyStr`1, None] */ me.shadaj.scalapy.py.Any]
def span(__group : /* Union[builtins.int, builtins.str] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): /* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("span")("__group" -> __group).as[/* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any]
def lastindex: /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("lastindex").as[/* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any]
def pos: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("pos").as[me.shadaj.scalapy.stdlib.int]
def groupdict(default : AnyStr = null.asInstanceOf[AnyStr])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, AnyStr]]): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, AnyStr] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("groupdict")("default" -> default).as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, AnyStr]]
}

object Match extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Match")) with py.Object {
/* member: regs */
/* attribute: re */
/* attribute: string */

/* attribute: endpos */





/* attribute: lastgroup */

/* attribute: lastindex */
/* attribute: pos */

}
@py.native trait AsyncContextManager[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
def __aenter__()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Awaitable[_T_co]]): me.shadaj.scalapy.typing.Awaitable[_T_co] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__aenter__")().as[me.shadaj.scalapy.typing.Awaitable[_T_co]]
def __aexit__(exc_type : /* Union[Type[builtins.BaseException], None] */ me.shadaj.scalapy.py.Any, exc_value : /* Union[builtins.BaseException, None] */ me.shadaj.scalapy.py.Any, traceback : /* Union[types.TracebackType, None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.typing.Awaitable[/* Union[builtins.bool, None] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__aexit__")("exc_type" -> exc_type, "exc_value" -> exc_value, "traceback" -> traceback).as[me.shadaj.scalapy.typing.Awaitable[/* Union[builtins.bool, None] */ me.shadaj.scalapy.py.Any]]
}

object AsyncContextManager extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("AsyncContextManager")) with py.Object {


}
@py.native trait AsyncIterable[_T_co <: me.shadaj.scalapy.py.Any] extends me.shadaj.scalapy.stdlib.`object` {
/* member: __aiter__ */
}

object AsyncIterable extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("AsyncIterable")) with py.Object {
/* member: __aiter__ */
}
@py.native trait ForwardRef extends me.shadaj.scalapy.stdlib.`object` {
/* skip override: __eq__ */

def `__forward_arg__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__forward_arg__").as[me.shadaj.scalapy.stdlib.str]
def `__forward_evaluated__`: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__forward_evaluated__").as[me.shadaj.scalapy.stdlib.bool]
def `__forward_value__`: /* Union[Any, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__forward_value__").as[/* Union[Any, None] */ me.shadaj.scalapy.py.Any]
def `__forward_is_argument__`: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__forward_is_argument__").as[me.shadaj.scalapy.stdlib.bool]
def `__forward_code__`: /* TypeInfo(
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
    replace)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__forward_code__").as[/* TypeInfo(
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
/* skip override: __hash__ */
/* skip override: __repr__ */
def _evaluate(globalns : /* Union[builtins.dict[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any, localns : /* Union[builtins.dict[builtins.str, Any], None] */ me.shadaj.scalapy.py.Any): /* Union[Any, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_evaluate")("globalns" -> globalns, "localns" -> localns).as[/* Union[Any, None] */ me.shadaj.scalapy.py.Any]
}

object ForwardRef extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ForwardRef")) with py.Object {

def apply(arg : me.shadaj.scalapy.stdlib.str, is_argument : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.typing.ForwardRef = as[me.shadaj.scalapy.py.Dynamic].applyNamed("arg" -> arg, "is_argument" -> is_argument).as[me.shadaj.scalapy.typing.ForwardRef]
/* attribute: __forward_arg__ */
/* attribute: __forward_evaluated__ */
/* attribute: __forward_value__ */
/* attribute: __forward_is_argument__ */
/* attribute: __forward_code__ */



}
/* TypeVarExpr:-1(
  UpperBound(def (*Any, **Any) -> Any)) */
def Generic: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Generic").as[me.shadaj.scalapy.typing._SpecialForm]
/* TypeVarExpr:-1(
  Variance(COVARIANT)) */
def Any: me.shadaj.scalapy.stdlib.`object` = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Any").as[me.shadaj.scalapy.stdlib.`object`]
/* TypeVarExpr:-1(
  Variance(COVARIANT)) */
/* <mypy.nodes.TypeAlias object at 0x7f86661aaac0> */
def Type: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Type").as[me.shadaj.scalapy.typing._SpecialForm]
def Callable: me.shadaj.scalapy.typing._SpecialForm = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Callable").as[me.shadaj.scalapy.typing._SpecialForm]
}
