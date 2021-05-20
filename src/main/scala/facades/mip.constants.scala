package me.shadaj.scalapy.mip
import me.shadaj.scalapy.py
package object constants extends me.shadaj.scalapy.py.StaticModule("mip.constants") {
def GREATER_OR_EQUAL: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("GREATER_OR_EQUAL").as[me.shadaj.scalapy.stdlib.str]
@py.native trait LP_Method extends me.shadaj.scalapy.enum.Enum {
def AUTO: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("AUTO").as[me.shadaj.scalapy.stdlib.int]
def BARRIER: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BARRIER").as[me.shadaj.scalapy.stdlib.int]
def PRIMAL: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("PRIMAL").as[me.shadaj.scalapy.stdlib.int]
def DUAL: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("DUAL").as[me.shadaj.scalapy.stdlib.int]
}

object LP_Method extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LP_Method")) with py.Object {
/* attribute: AUTO */
/* attribute: BARRIER */
/* attribute: PRIMAL */
/* attribute: DUAL */
}
@py.native trait ConstraintPriority extends me.shadaj.scalapy.enum.Enum {
def HIGH_PRIORITY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("HIGH_PRIORITY").as[me.shadaj.scalapy.stdlib.int]
def LOW_PRIORITY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LOW_PRIORITY").as[me.shadaj.scalapy.stdlib.int]
def VERY_HIGH_PRIORITY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("VERY_HIGH_PRIORITY").as[me.shadaj.scalapy.stdlib.int]
def VERY_LOW_PRIORITY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("VERY_LOW_PRIORITY").as[me.shadaj.scalapy.stdlib.int]
def MID_PRIORITY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MID_PRIORITY").as[me.shadaj.scalapy.stdlib.int]
def MANDATORY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MANDATORY").as[me.shadaj.scalapy.stdlib.int]
def NORMAL_PRIORITY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("NORMAL_PRIORITY").as[me.shadaj.scalapy.stdlib.int]
def <(other : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("other" -> other).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
}

object ConstraintPriority extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ConstraintPriority")) with py.Object {
/* attribute: HIGH_PRIORITY */
/* attribute: LOW_PRIORITY */
/* attribute: VERY_HIGH_PRIORITY */
/* attribute: VERY_LOW_PRIORITY */
/* attribute: MID_PRIORITY */
/* attribute: MANDATORY */
/* attribute: NORMAL_PRIORITY */

}
def CPLEX: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CPLEX").as[me.shadaj.scalapy.stdlib.str]
def MAXIMIZE: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MAXIMIZE").as[me.shadaj.scalapy.stdlib.str]
def CPX: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CPX").as[me.shadaj.scalapy.stdlib.str]
@py.native trait OptimizationStatus extends me.shadaj.scalapy.enum.Enum {
def OTHER: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("OTHER").as[me.shadaj.scalapy.stdlib.int]
def UNBOUNDED: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("UNBOUNDED").as[me.shadaj.scalapy.stdlib.int]
def CUTOFF: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CUTOFF").as[me.shadaj.scalapy.stdlib.int]
def LOADED: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LOADED").as[me.shadaj.scalapy.stdlib.int]
def NO_SOLUTION_FOUND: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("NO_SOLUTION_FOUND").as[me.shadaj.scalapy.stdlib.int]
def OPTIMAL: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("OPTIMAL").as[me.shadaj.scalapy.stdlib.int]
def INFEASIBLE: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("INFEASIBLE").as[me.shadaj.scalapy.stdlib.int]
def ERROR: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ERROR").as[me.shadaj.scalapy.stdlib.int]
def FEASIBLE: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FEASIBLE").as[me.shadaj.scalapy.stdlib.int]
def INT_INFEASIBLE: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("INT_INFEASIBLE").as[me.shadaj.scalapy.stdlib.int]
}

object OptimizationStatus extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("OptimizationStatus")) with py.Object {
/* attribute: OTHER */
/* attribute: UNBOUNDED */
/* attribute: CUTOFF */
/* attribute: LOADED */
/* attribute: NO_SOLUTION_FOUND */
/* attribute: OPTIMAL */
/* attribute: INFEASIBLE */
/* attribute: ERROR */
/* attribute: FEASIBLE */
/* attribute: INT_INFEASIBLE */
}
def MIN: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MIN").as[me.shadaj.scalapy.stdlib.str]
def GUROBI: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("GUROBI").as[me.shadaj.scalapy.stdlib.str]
@py.native trait SearchEmphasis extends me.shadaj.scalapy.enum.Enum {
def FEASIBILITY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FEASIBILITY").as[me.shadaj.scalapy.stdlib.int]
def DEFAULT: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("DEFAULT").as[me.shadaj.scalapy.stdlib.int]
def OPTIMALITY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("OPTIMALITY").as[me.shadaj.scalapy.stdlib.int]
}

object SearchEmphasis extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SearchEmphasis")) with py.Object {
/* attribute: FEASIBILITY */
/* attribute: DEFAULT */
/* attribute: OPTIMALITY */
}
def GRB: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("GRB").as[me.shadaj.scalapy.stdlib.str]
def CBC: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CBC").as[me.shadaj.scalapy.stdlib.str]
def MAX: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MAX").as[me.shadaj.scalapy.stdlib.str]
def INTEGER: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("INTEGER").as[me.shadaj.scalapy.stdlib.str]
def MINIMIZE: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MINIMIZE").as[me.shadaj.scalapy.stdlib.str]
def BINARY: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BINARY").as[me.shadaj.scalapy.stdlib.str]
def LESS_OR_EQUAL: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LESS_OR_EQUAL").as[me.shadaj.scalapy.stdlib.str]
def SCIP: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SCIP").as[me.shadaj.scalapy.stdlib.str]
def INF: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("INF").as[me.shadaj.scalapy.stdlib.float]
def EPS: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("EPS").as[me.shadaj.scalapy.stdlib.float]
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
def CONTINUOUS: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CONTINUOUS").as[me.shadaj.scalapy.stdlib.str]
def EQUAL: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("EQUAL").as[me.shadaj.scalapy.stdlib.str]
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
def ffi: /* TypeInfo(
  Name(cffi.api.FFI)
  Bases(builtins.object)
  Mro(cffi.api.FFI, builtins.object)
  Names(
    BCharA (Any)
    BVoidP (Any)
    CData (Any)
    CType (Any)
    NULL (Any)
    __init__
    _apply_embedding_fix
    _apply_windows_unicode
    _assigned_source (Any)
    _backend (Any)
    _cached_btypes (Any)
    _cdef
    _cdef_version (Any)
    _cdefsources (Any)
    _embedding (Any)
    _function_caches (Any)
    _get_cached_btype
    _get_errno
    _included_ffis (Any)
    _init_once_cache (Any)
    _libraries (Any)
    _lock (Any)
    _new_types (Any)
    _parsed_types (Any)
    _parser (Any)
    _pointer_to
    _set_errno
    _typecache (Any)
    _typeof
    _typeof_locked
    _typeoffsetof
    _windows_unicode (Any)
    addressof
    alignof
    buffer (Any)
    callback
    cast
    cdef
    compile
    def_extern
    distutils_extension
    dlclose
    dlopen
    embedding_api
    embedding_init_code
    emit_c_code
    emit_python_code
    errno (builtins.property)
    from_buffer
    from_handle
    gc
    getctype
    getwinerror
    include
    init_once
    list_types
    memmove
    new
    new_allocator
    new_handle
    offsetof
    release
    set_source
    set_source_pkgconfig
    set_unicode
    sizeof
    string
    typeof
    unpack
    verifier (Any)
    verify)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ffi").as[/* TypeInfo(
  Name(cffi.api.FFI)
  Bases(builtins.object)
  Mro(cffi.api.FFI, builtins.object)
  Names(
    BCharA (Any)
    BVoidP (Any)
    CData (Any)
    CType (Any)
    NULL (Any)
    __init__
    _apply_embedding_fix
    _apply_windows_unicode
    _assigned_source (Any)
    _backend (Any)
    _cached_btypes (Any)
    _cdef
    _cdef_version (Any)
    _cdefsources (Any)
    _embedding (Any)
    _function_caches (Any)
    _get_cached_btype
    _get_errno
    _included_ffis (Any)
    _init_once_cache (Any)
    _libraries (Any)
    _lock (Any)
    _new_types (Any)
    _parsed_types (Any)
    _parser (Any)
    _pointer_to
    _set_errno
    _typecache (Any)
    _typeof
    _typeof_locked
    _typeoffsetof
    _windows_unicode (Any)
    addressof
    alignof
    buffer (Any)
    callback
    cast
    cdef
    compile
    def_extern
    distutils_extension
    dlclose
    dlopen
    embedding_api
    embedding_init_code
    emit_c_code
    emit_python_code
    errno (builtins.property)
    from_buffer
    from_handle
    gc
    getctype
    getwinerror
    include
    init_once
    list_types
    memmove
    new
    new_allocator
    new_handle
    offsetof
    release
    set_source
    set_source_pkgconfig
    set_unicode
    sizeof
    string
    typeof
    unpack
    verifier (Any)
    verify)) */ me.shadaj.scalapy.py.Any]
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
def INT_MAX: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("INT_MAX").as[me.shadaj.scalapy.py.Any]
@py.native trait CutType extends me.shadaj.scalapy.enum.Enum {
def GOMORY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("GOMORY").as[me.shadaj.scalapy.stdlib.int]
def KNAPSACK_COVER: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("KNAPSACK_COVER").as[me.shadaj.scalapy.stdlib.int]
def PROBING: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("PROBING").as[me.shadaj.scalapy.stdlib.int]
def ODD_WHEEL: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ODD_WHEEL").as[me.shadaj.scalapy.stdlib.int]
def CLIQUE: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CLIQUE").as[me.shadaj.scalapy.stdlib.int]
def TWO_MIR: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("TWO_MIR").as[me.shadaj.scalapy.stdlib.int]
def GMI: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("GMI").as[me.shadaj.scalapy.stdlib.int]
def MIR: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("MIR").as[me.shadaj.scalapy.stdlib.int]
def FLOW_COVER: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FLOW_COVER").as[me.shadaj.scalapy.stdlib.int]
def ZERO_HALF: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ZERO_HALF").as[me.shadaj.scalapy.stdlib.int]
def RED_SPLIT: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("RED_SPLIT").as[me.shadaj.scalapy.stdlib.int]
def LATWO_MIR: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LATWO_MIR").as[me.shadaj.scalapy.stdlib.int]
def RESIDUAL_CAPACITY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("RESIDUAL_CAPACITY").as[me.shadaj.scalapy.stdlib.int]
def RED_SPLIT_G: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("RED_SPLIT_G").as[me.shadaj.scalapy.stdlib.int]
def LIFT_AND_PROJECT: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LIFT_AND_PROJECT").as[me.shadaj.scalapy.stdlib.int]
}

object CutType extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CutType")) with py.Object {
/* attribute: GOMORY */
/* attribute: KNAPSACK_COVER */
/* attribute: PROBING */
/* attribute: ODD_WHEEL */
/* attribute: CLIQUE */
/* attribute: TWO_MIR */
/* attribute: GMI */
/* attribute: MIR */
/* attribute: FLOW_COVER */
/* attribute: ZERO_HALF */
/* attribute: RED_SPLIT */
/* attribute: LATWO_MIR */
/* attribute: RESIDUAL_CAPACITY */
/* attribute: RED_SPLIT_G */
/* attribute: LIFT_AND_PROJECT */
}
}
