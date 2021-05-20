package me.shadaj.scalapy
import me.shadaj.scalapy.py
package object enum extends me.shadaj.scalapy.py.StaticModule("enum") {
@py.native trait auto extends me.shadaj.scalapy.enum.IntFlag {
/* skip override: value */
}

object auto extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("auto")) with py.Object {
/* attribute: value */
}
@py.native trait IntFlag extends me.shadaj.scalapy.stdlib.int with me.shadaj.scalapy.enum.Flag {
/* skip override: __and__ */
/* skip override: __xor__ */
/* skip override: __ror__ */
/* skip override: __rxor__ */
/* skip override: __rand__ */
/* skip override: __or__ */
  override def __bool__(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("__bool__")().as[me.shadaj.scalapy.stdlib.bool]
}

object IntFlag extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IntFlag")) with py.Object {


/* attribute: __ror__ */
/* attribute: __rxor__ */
/* attribute: __rand__ */

}
@py.native trait Enum extends me.shadaj.scalapy.stdlib.`object` {
/* skip override: __repr__ */
def `_member_names_`: me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_member_names_").as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str]]
def `__order__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__order__").as[me.shadaj.scalapy.stdlib.str]
/* member: _generate_next_value_ */
def `_name_`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_name_").as[me.shadaj.scalapy.stdlib.str]
/* skip override: __new__ */
/* skip override: __dir__ */
def `_value2member_map_`: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.int, me.shadaj.scalapy.enum.Enum] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_value2member_map_").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.int, me.shadaj.scalapy.enum.Enum]]
/* skip override: __format__ */
/* skip override: __reduce_ex__ */
def member_value: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("value").as[me.shadaj.scalapy.py.Any]
/* skip override: __hash__ */
/* member: _missing_ */
def `_ignore_`: /* Union[builtins.str, builtins.list[builtins.str]] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_ignore_").as[/* Union[builtins.str, builtins.list[builtins.str]] */ me.shadaj.scalapy.py.Any]
def name: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("name").as[me.shadaj.scalapy.stdlib.str]
def `_order_`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_order_").as[me.shadaj.scalapy.stdlib.str]
/* skip override: __str__ */
def `_member_map_`: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.enum.Enum] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_member_map_").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.enum.Enum]]
def `_value_`: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_value_").as[me.shadaj.scalapy.py.Any]
}

object Enum extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Enum")) with py.Object {

/* attribute: _member_names_ */
/* attribute: __order__ */
/* member: _generate_next_value_ */
/* attribute: _name_ */


/* attribute: _value2member_map_ */


/* attribute: value */

/* member: _missing_ */
/* attribute: _ignore_ */
/* attribute: name */
/* attribute: _order_ */

/* attribute: _member_map_ */
/* attribute: _value_ */
}
@py.native trait EnumMeta extends /* TypeInfo(
  Name(abc.ABCMeta)
  Bases(builtins.type)
  Mro(abc.ABCMeta, builtins.type, builtins.object)
  Names(
    register)) */ me.shadaj.scalapy.py.Any {
def __contains__(member : me.shadaj.scalapy.stdlib.`object`): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__contains__")("member" -> member).as[me.shadaj.scalapy.stdlib.bool]
def __iter__[_T <: me.shadaj.scalapy.py.Any]()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Iterator[_T]]): me.shadaj.scalapy.typing.Iterator[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iter__")().as[me.shadaj.scalapy.typing.Iterator[_T]]
def __len__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__len__")().as[me.shadaj.scalapy.stdlib.int]
def __getitem__[_T <: me.shadaj.scalapy.py.Any](name : me.shadaj.scalapy.stdlib.str)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getitem__")("name" -> name).as[_T]
def __reversed__[_T <: me.shadaj.scalapy.py.Any]()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[me.shadaj.scalapy.typing.Iterator[_T]]): me.shadaj.scalapy.typing.Iterator[_T] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__reversed__")().as[me.shadaj.scalapy.typing.Iterator[_T]]
/* member: __members__ */
}

object EnumMeta extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("EnumMeta")) with py.Object {





/* member: __members__ */
}
/* TypeVarExpr:-1(
  UpperBound(Type[enum.Enum])) */
@py.native trait Flag extends me.shadaj.scalapy.enum.Enum {
def __and__[_T <: me.shadaj.scalapy.py.Any](other : _T)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__and__")("other" -> other).as[_T]
def __or__[_T <: me.shadaj.scalapy.py.Any](other : _T)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__or__")("other" -> other).as[_T]
/* skip override: __str__ */
def __bool__(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__bool__")().as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __repr__ */
def __contains__[_T <: me.shadaj.scalapy.py.Any](other : _T): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__contains__")("other" -> other).as[me.shadaj.scalapy.stdlib.bool]
def __xor__[_T <: me.shadaj.scalapy.py.Any](other : _T)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__xor__")("other" -> other).as[_T]
def __invert__[_T <: me.shadaj.scalapy.py.Any]()(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_T]): _T = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__invert__")().as[_T]
}

object Flag extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Flag")) with py.Object {








}
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
def unique[_S <: me.shadaj.scalapy.py.Any](enumeration : _S)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_S]): _S = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("unique")(enumeration).as[_S]
def _auto_null: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_auto_null").as[me.shadaj.scalapy.py.Any]
/* TypeVarExpr:-1() */
@py.native trait IntEnum extends me.shadaj.scalapy.stdlib.int with me.shadaj.scalapy.enum.Enum {
/* skip override: value */
}

object IntEnum extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IntEnum")) with py.Object {
/* attribute: value */
}
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
}
