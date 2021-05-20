package me.shadaj.scalapy.mip
import me.shadaj.scalapy.py
package object model extends me.shadaj.scalapy.py.StaticModule("mip.model") {
def logger: /* TypeInfo(
  Name(logging.Logger)
  Bases(logging.Filterer)
  Mro(logging.Logger, logging.Filterer, builtins.object)
  Names(
    __init__
    _log
    addFilter
    addHandler
    critical
    debug
    disabled (builtins.int)
    error
    exception
    filter
    findCaller
    getChild
    getEffectiveLevel
    handle
    handlers (builtins.list[logging.Handler])
    hasHandlers
    info
    isEnabledFor
    level (builtins.int)
    log
    makeRecord
    name (builtins.str)
    parent (Union[logging.Logger, logging.PlaceHolder])
    propagate (builtins.bool)
    removeFilter
    removeHandler
    setLevel
    warn
    warning)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("logger").as[/* TypeInfo(
  Name(logging.Logger)
  Bases(logging.Filterer)
  Mro(logging.Logger, logging.Filterer, builtins.object)
  Names(
    __init__
    _log
    addFilter
    addHandler
    critical
    debug
    disabled (builtins.int)
    error
    exception
    filter
    findCaller
    getChild
    getEffectiveLevel
    handle
    handlers (builtins.list[logging.Handler])
    hasHandlers
    info
    isEnabledFor
    level (builtins.int)
    log
    makeRecord
    name (builtins.str)
    parent (Union[logging.Logger, logging.PlaceHolder])
    propagate (builtins.bool)
    removeFilter
    removeHandler
    setLevel
    warn
    warning)) */ me.shadaj.scalapy.py.Any]
def customCbcLib: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("customCbcLib").as[me.shadaj.scalapy.stdlib.str]
def features(): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("features")().as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str]]
def quicksum: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("quicksum").as[me.shadaj.scalapy.py.Any]
@py.native trait Model extends me.shadaj.scalapy.stdlib.`object` {
def clique_merge(constrs : /* Union[builtins.list[mip.entities.Constr], None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clique_merge")("constrs" -> constrs).as[me.shadaj.scalapy.py.Any]
def verbose(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("verbose")().as[me.shadaj.scalapy.stdlib.int]
def verbose_=(verbose : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("verbose")(verbose)
/* member: num_rows */
def __n_cols: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__n_cols").as[me.shadaj.scalapy.stdlib.int]
def opt_tol(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("opt_tol")().as[me.shadaj.scalapy.stdlib.float]
def opt_tol_=(tol : me.shadaj.scalapy.stdlib.float): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("opt_tol")(tol)
def translate(ref : me.shadaj.scalapy.py.Any): /* Union[builtins.list[Any], builtins.dict[Any, Any], mip.entities.Var] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("translate")("ref" -> ref).as[/* Union[builtins.list[Any], builtins.dict[Any, Any], mip.entities.Var] */ me.shadaj.scalapy.py.Any]
def constr_by_name(name : me.shadaj.scalapy.stdlib.str): /* Union[mip.entities.Constr, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("constr_by_name")("name" -> name).as[/* Union[mip.entities.Constr, None] */ me.shadaj.scalapy.py.Any]
def __sol_pool_size: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__sol_pool_size").as[me.shadaj.scalapy.stdlib.int]
def validate_mip_start(): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("validate_mip_start")().as[me.shadaj.scalapy.py.Any]
def read(path : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("read")("path" -> path).as[me.shadaj.scalapy.py.Any]
def add_sos(sos : me.shadaj.scalapy.stdlib.list[/* Tuple[mip.entities.Var, numbers.Real] */ me.shadaj.scalapy.py.Any], sos_type : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_sos")("sos" -> sos, "sos_type" -> sos_type).as[me.shadaj.scalapy.py.Any]
def name(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("name")().as[me.shadaj.scalapy.stdlib.str]
def name_=(name : me.shadaj.scalapy.stdlib.str): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("name")(name)
def max_mip_gap(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("max_mip_gap")().as[me.shadaj.scalapy.stdlib.float]
def max_mip_gap_=(max_mip_gap : me.shadaj.scalapy.stdlib.float): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("max_mip_gap")(max_mip_gap)
def __integer_tol: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__integer_tol").as[me.shadaj.scalapy.stdlib.float]
def __gap: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__gap").as[me.shadaj.scalapy.stdlib.float]
def cuts_generator(): /* Union[mip.callbacks.ConstrsGenerator, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cuts_generator")().as[/* Union[mip.callbacks.ConstrsGenerator, None] */ me.shadaj.scalapy.py.Any]
def cuts_generator_=(cuts_generator : /* Union[mip.callbacks.ConstrsGenerator, None] */ me.shadaj.scalapy.py.Any): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("cuts_generator")(cuts_generator)
def seed(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("seed")().as[me.shadaj.scalapy.stdlib.int]
def seed_=(seed : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("seed")(seed)
def __store_search_progress_log: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__store_search_progress_log").as[me.shadaj.scalapy.stdlib.bool]
def max_solutions(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("max_solutions")().as[me.shadaj.scalapy.stdlib.int]
def max_solutions_=(max_solutions : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("max_solutions")(max_solutions)
def optimize(max_seconds : me.shadaj.scalapy.numbers.Real = null.asInstanceOf[me.shadaj.scalapy.numbers.Real], max_nodes : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], max_solutions : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], max_seconds_same_incumbent : me.shadaj.scalapy.numbers.Real = null.asInstanceOf[me.shadaj.scalapy.numbers.Real], max_nodes_same_incumbent : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], relax : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.mip.constants.OptimizationStatus = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("optimize")("max_seconds" -> max_seconds, "max_nodes" -> max_nodes, "max_solutions" -> max_solutions, "max_seconds_same_incumbent" -> max_seconds_same_incumbent, "max_nodes_same_incumbent" -> max_nodes_same_incumbent, "relax" -> relax).as[me.shadaj.scalapy.mip.constants.OptimizationStatus]
def max_mip_gap_abs(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("max_mip_gap_abs")().as[me.shadaj.scalapy.stdlib.float]
def max_mip_gap_abs_=(max_mip_gap_abs : me.shadaj.scalapy.stdlib.float): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("max_mip_gap_abs")(max_mip_gap_abs)
def clear(): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clear")().as[me.shadaj.scalapy.py.Any]
def vars: /* TypeInfo(
  Name(mip.lists.VarList)
  Bases(typing.Sequence[Any])
  Mro(mip.lists.VarList, typing.Sequence, typing.Collection, typing.Iterable, typing.Container, typing.Reversible, builtins.object)
  Names(
    __getitem__
    __init__
    __len__
    __model (mip.model.Model)
    __vars (builtins.list[Any])
    add
    remove
    update_vars)
  MetaclassType(abc.ABCMeta)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("vars").as[/* TypeInfo(
  Name(mip.lists.VarList)
  Bases(typing.Sequence[Any])
  Mro(mip.lists.VarList, typing.Sequence, typing.Collection, typing.Iterable, typing.Container, typing.Reversible, builtins.object)
  Names(
    __getitem__
    __init__
    __len__
    __model (mip.model.Model)
    __vars (builtins.list[Any])
    add
    remove
    update_vars)
  MetaclassType(abc.ABCMeta)) */ me.shadaj.scalapy.py.Any]
def sol_pool_size(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sol_pool_size")().as[me.shadaj.scalapy.stdlib.int]
def sol_pool_size_=(sol_pool_size : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("sol_pool_size")(sol_pool_size)
/* member: objective_bound */
def max_seconds(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("max_seconds")().as[me.shadaj.scalapy.stdlib.float]
def max_seconds_=(max_seconds : me.shadaj.scalapy.stdlib.float): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("max_seconds")(max_seconds)
def __cut_passes: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__cut_passes").as[me.shadaj.scalapy.stdlib.int]
def _ownSolver: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_ownSolver").as[me.shadaj.scalapy.stdlib.bool]
/* member: search_progress_log */
def __max_seconds_same_incumbent: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__max_seconds_same_incumbent").as[me.shadaj.scalapy.stdlib.float]
def lp_method(): me.shadaj.scalapy.mip.constants.LP_Method = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lp_method")().as[me.shadaj.scalapy.mip.constants.LP_Method]
def lp_method_=(lpm : me.shadaj.scalapy.mip.constants.LP_Method): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("lp_method")(lpm)
def lazy_constrs_generator(): /* Union[mip.callbacks.ConstrsGenerator, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lazy_constrs_generator")().as[/* Union[mip.callbacks.ConstrsGenerator, None] */ me.shadaj.scalapy.py.Any]
def lazy_constrs_generator_=(lazy_constrs_generator : /* Union[mip.callbacks.ConstrsGenerator, None] */ me.shadaj.scalapy.py.Any): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("lazy_constrs_generator")(lazy_constrs_generator)
def max_nodes(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("max_nodes")().as[me.shadaj.scalapy.stdlib.int]
def max_nodes_=(max_nodes : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("max_nodes")(max_nodes)
def __cuts: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__cuts").as[me.shadaj.scalapy.stdlib.int]
def generate_cuts(cut_types : /* Union[builtins.list[mip.constants.CutType], None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], depth : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], npass : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], max_cuts : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], min_viol : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float]): /* TypeInfo(
  Name(mip.callbacks.CutPool)
  Bases(builtins.object)
  Mro(mip.callbacks.CutPool, builtins.object)
  Names(
    __cuts (Any)
    __init__
    __pos (Any)
    add
    cuts)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("generate_cuts")("cut_types" -> cut_types, "depth" -> depth, "npass" -> npass, "max_cuts" -> max_cuts, "min_viol" -> min_viol).as[/* TypeInfo(
  Name(mip.callbacks.CutPool)
  Bases(builtins.object)
  Mro(mip.callbacks.CutPool, builtins.object)
  Names(
    __cuts (Any)
    __init__
    __pos (Any)
    add
    cuts)) */ me.shadaj.scalapy.py.Any]
def __del__(): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__del__")().as[me.shadaj.scalapy.py.Any]
def __lazy_constrs_generator: me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__lazy_constrs_generator").as[me.shadaj.scalapy.py.None]
def check_optimization_results(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("check_optimization_results")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __max_nodes_same_incumbent: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__max_nodes_same_incumbent").as[me.shadaj.scalapy.stdlib.float]

/* member: objective_values */
def __iadd__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.model.Model = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iadd__")("other" -> other).as[me.shadaj.scalapy.mip.model.Model]
def __preprocess: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__preprocess").as[me.shadaj.scalapy.stdlib.int]
def __round_int_vars: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__round_int_vars").as[me.shadaj.scalapy.stdlib.bool]
def add_cut(cut : me.shadaj.scalapy.mip.entities.LinExpr): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_cut")("cut" -> cut).as[me.shadaj.scalapy.py.Any]
def add_constr(lin_expr : me.shadaj.scalapy.mip.entities.LinExpr, name : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], priority : /* Union[mip.constants.ConstraintPriority, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.mip.entities.Constr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_constr")("lin_expr" -> lin_expr, "name" -> name, "priority" -> priority).as[me.shadaj.scalapy.mip.entities.Constr]
/* member: num_int */
def __n_rows: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__n_rows").as[me.shadaj.scalapy.stdlib.int]
def __threads: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__threads").as[me.shadaj.scalapy.stdlib.int]
def pump_passes(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pump_passes")().as[me.shadaj.scalapy.stdlib.int]
def pump_passes_=(passes : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("pump_passes")(passes)
def preprocess(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("preprocess")().as[me.shadaj.scalapy.stdlib.int]
def preprocess_=(prep : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("preprocess")(prep)
def round_int_vars(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("round_int_vars")().as[me.shadaj.scalapy.stdlib.bool]
def round_int_vars_=(round_iv : me.shadaj.scalapy.stdlib.bool): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("round_int_vars")(round_iv)
def cuts(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cuts")().as[me.shadaj.scalapy.stdlib.int]
def cuts_=(gencuts : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("cuts")(gencuts)
def integer_tol(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("integer_tol")().as[me.shadaj.scalapy.stdlib.float]
def integer_tol_=(int_tol : me.shadaj.scalapy.stdlib.float): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("integer_tol")(int_tol)
def solver: /* Union[mip.solver.Solver, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("solver").as[/* Union[mip.solver.Solver, None] */ me.shadaj.scalapy.py.Any]
def objective(): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("objective")().as[me.shadaj.scalapy.mip.entities.LinExpr]
def objective_=(objective : /* Union[numbers.Real, mip.entities.Var, mip.entities.LinExpr, mip.ndarray.LinExprTensor] */ me.shadaj.scalapy.py.Any): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("objective")(objective)
def constrs: /* TypeInfo(
  Name(mip.lists.ConstrList)
  Bases(typing.Sequence[Any])
  Mro(mip.lists.ConstrList, typing.Sequence, typing.Collection, typing.Iterable, typing.Container, typing.Reversible, builtins.object)
  Names(
    __constrs (builtins.list[mip.entities.Constr])
    __getitem__
    __init__
    __len__
    __model (mip.model.Model)
    add
    remove
    update_constrs)
  MetaclassType(abc.ABCMeta)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("constrs").as[/* TypeInfo(
  Name(mip.lists.ConstrList)
  Bases(typing.Sequence[Any])
  Mro(mip.lists.ConstrList, typing.Sequence, typing.Collection, typing.Iterable, typing.Container, typing.Reversible, builtins.object)
  Names(
    __constrs (builtins.list[mip.entities.Constr])
    __getitem__
    __init__
    __len__
    __model (mip.model.Model)
    add
    remove
    update_constrs)
  MetaclassType(abc.ABCMeta)) */ me.shadaj.scalapy.py.Any]
def __lp_method: me.shadaj.scalapy.mip.constants.LP_Method = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__lp_method").as[me.shadaj.scalapy.mip.constants.LP_Method]
def __max_mip_gap_abs: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__max_mip_gap_abs").as[me.shadaj.scalapy.stdlib.float]
def __clique: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__clique").as[me.shadaj.scalapy.stdlib.int]
def remove(objects : /* Union[mip.entities.Var, mip.entities.Constr, builtins.list[Union[mip.entities.Var, mip.entities.Constr]]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("remove")("objects" -> objects).as[me.shadaj.scalapy.py.Any]
def add_lazy_constr(expr : me.shadaj.scalapy.mip.entities.LinExpr): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_lazy_constr")("expr" -> expr).as[me.shadaj.scalapy.py.Any]
def cutoff(): me.shadaj.scalapy.numbers.Real = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cutoff")().as[me.shadaj.scalapy.numbers.Real]
def cutoff_=(cutoff : me.shadaj.scalapy.stdlib.float): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("cutoff")(cutoff)
def sense(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sense")().as[me.shadaj.scalapy.stdlib.str]
def sense_=(sense : me.shadaj.scalapy.stdlib.str): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("sense")(sense)
/* member: gap */
def add_var(name : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], lb : me.shadaj.scalapy.numbers.Real = null.asInstanceOf[me.shadaj.scalapy.numbers.Real], ub : me.shadaj.scalapy.numbers.Real = null.asInstanceOf[me.shadaj.scalapy.numbers.Real], obj : me.shadaj.scalapy.numbers.Real = null.asInstanceOf[me.shadaj.scalapy.numbers.Real], var_type : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], column : /* Union[mip.entities.Column, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.mip.entities.Var = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_var")("name" -> name, "lb" -> lb, "ub" -> ub, "obj" -> obj, "var_type" -> var_type, "column" -> column).as[me.shadaj.scalapy.mip.entities.Var]
def store_search_progress_log(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("store_search_progress_log")().as[me.shadaj.scalapy.stdlib.bool]
def store_search_progress_log_=(store : me.shadaj.scalapy.stdlib.bool): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("store_search_progress_log")(store)
/* member: conflict_graph */
/* member: status */
def emphasis(): me.shadaj.scalapy.mip.constants.SearchEmphasis = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("emphasis")().as[me.shadaj.scalapy.mip.constants.SearchEmphasis]
def emphasis_=(emphasis : me.shadaj.scalapy.mip.constants.SearchEmphasis): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("emphasis")(emphasis)
/* member: num_solutions */
/* member: num_nz */
/* member: num_cols */
/* member: objective_value */
def copy(solver_name : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.mip.model.Model = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("copy")("solver_name" -> solver_name).as[me.shadaj.scalapy.mip.model.Model]
def __infeas_tol: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__infeas_tol").as[me.shadaj.scalapy.stdlib.float]
def infeas_tol(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("infeas_tol")().as[me.shadaj.scalapy.stdlib.float]
def infeas_tol_=(inf_tol : me.shadaj.scalapy.stdlib.float): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("infeas_tol")(inf_tol)
def __max_mip_gap: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__max_mip_gap").as[me.shadaj.scalapy.stdlib.float]
def __seed: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__seed").as[me.shadaj.scalapy.stdlib.int]
def start(): /* Union[builtins.list[Tuple[mip.entities.Var, numbers.Real]], None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("start")().as[/* Union[builtins.list[Tuple[mip.entities.Var, numbers.Real]], None] */ me.shadaj.scalapy.py.Any]
def start_=(start : /* Union[builtins.list[Tuple[mip.entities.Var, numbers.Real]], None] */ me.shadaj.scalapy.py.Any): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("start")(start)
def __start: me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__start").as[me.shadaj.scalapy.py.None]
def __plog: /* TypeInfo(
  Name(mip.log.ProgressLog)
  Bases(builtins.object)
  Mro(mip.log.ProgressLog, builtins.object)
  Names(
    __init__
    instance (Any)
    log (Any)
    read
    settings (Any)
    write)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__plog").as[/* TypeInfo(
  Name(mip.log.ProgressLog)
  Bases(builtins.object)
  Mro(mip.log.ProgressLog, builtins.object)
  Names(
    __init__
    instance (Any)
    log (Any)
    read
    settings (Any)
    write)) */ me.shadaj.scalapy.py.Any]
def __opt_tol: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__opt_tol").as[me.shadaj.scalapy.stdlib.float]
def relax(): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("relax")().as[me.shadaj.scalapy.py.Any]
def threads(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("threads")().as[me.shadaj.scalapy.stdlib.int]
def threads_=(threads : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("threads")(threads)
def cut_passes(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cut_passes")().as[me.shadaj.scalapy.stdlib.int]
def cut_passes_=(cp : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("cut_passes")(cp)
def __cuts_generator: me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__cuts_generator").as[me.shadaj.scalapy.py.None]
def _iadd_tensor_element(tensor : /* TypeInfo(
  Name(mip.ndarray.LinExprTensor)
  Bases(numpy.ndarray)
  Mro(mip.ndarray.LinExprTensor, numpy.ndarray, numpy._ArrayOrScalarCommon, typing.Iterable, typing.Sized, typing.Container, builtins.object)
  Names(
    __array_finalize__
    __eq__
    __ge__
    __le__
    __new__)
  MetaclassType(abc.ABCMeta)) */ me.shadaj.scalapy.py.Any, element : /* Union[mip.entities.LinExpr, mip.callbacks.CutPool, numbers.Real, builtins.bool] */ me.shadaj.scalapy.py.Any, index : /* Union[builtins.tuple[builtins.int], None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], label : /* Union[builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_iadd_tensor_element")("tensor" -> tensor, "element" -> element, "index" -> index, "label" -> label).as[me.shadaj.scalapy.py.Any]
def write(file_path : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("write")("file_path" -> file_path).as[me.shadaj.scalapy.py.Any]
def objective_const(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("objective_const")().as[me.shadaj.scalapy.stdlib.float]
def objective_const_=(objective_const : me.shadaj.scalapy.stdlib.float): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("objective_const")(objective_const)
def var_by_name(name : me.shadaj.scalapy.stdlib.str): /* Union[mip.entities.Var, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("var_by_name")("name" -> name).as[/* Union[mip.entities.Var, None] */ me.shadaj.scalapy.py.Any]
def clique(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clique")().as[me.shadaj.scalapy.stdlib.int]
def clique_=(clq : me.shadaj.scalapy.stdlib.int): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("clique")(clq)
def _status: me.shadaj.scalapy.mip.constants.OptimizationStatus = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_status").as[me.shadaj.scalapy.mip.constants.OptimizationStatus]
def add_var_tensor(shape : me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.stdlib.int], name : me.shadaj.scalapy.stdlib.str, kwargs : me.shadaj.scalapy.py.Any): /* TypeInfo(
  Name(mip.ndarray.LinExprTensor)
  Bases(numpy.ndarray)
  Mro(mip.ndarray.LinExprTensor, numpy.ndarray, numpy._ArrayOrScalarCommon, typing.Iterable, typing.Sized, typing.Container, builtins.object)
  Names(
    __array_finalize__
    __eq__
    __ge__
    __le__
    __new__)
  MetaclassType(abc.ABCMeta)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_var_tensor")("shape" -> shape, "name" -> name, "kwargs" -> kwargs).as[/* TypeInfo(
  Name(mip.ndarray.LinExprTensor)
  Bases(numpy.ndarray)
  Mro(mip.ndarray.LinExprTensor, numpy.ndarray, numpy._ArrayOrScalarCommon, typing.Iterable, typing.Sized, typing.Container, builtins.object)
  Names(
    __array_finalize__
    __eq__
    __ge__
    __le__
    __new__)
  MetaclassType(abc.ABCMeta)) */ me.shadaj.scalapy.py.Any]
def solver_name: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("solver_name").as[me.shadaj.scalapy.stdlib.str]
}

object Model extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Model")) with py.Object {


/* member: num_rows */
/* attribute: __n_cols */



/* attribute: __sol_pool_size */





/* attribute: __integer_tol */
/* attribute: __gap */


/* attribute: __store_search_progress_log */




/* attribute: vars */

/* member: objective_bound */

/* attribute: __cut_passes */
/* attribute: _ownSolver */
/* member: search_progress_log */
/* attribute: __max_seconds_same_incumbent */



/* attribute: __cuts */


/* attribute: __lazy_constrs_generator */

/* attribute: __max_nodes_same_incumbent */
def apply(name : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], sense : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], solver_name : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str], solver : /* Union[mip.solver.Solver, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.mip.model.Model = as[me.shadaj.scalapy.py.Dynamic].applyNamed("name" -> name, "sense" -> sense, "solver_name" -> solver_name, "solver" -> solver).as[me.shadaj.scalapy.mip.model.Model]
/* member: objective_values */

/* attribute: __preprocess */
/* attribute: __round_int_vars */


/* member: num_int */
/* attribute: __n_rows */
/* attribute: __threads */





/* attribute: solver */

/* attribute: constrs */
/* attribute: __lp_method */
/* attribute: __max_mip_gap_abs */
/* attribute: __clique */




/* member: gap */


/* member: conflict_graph */
/* member: status */

/* member: num_solutions */
/* member: num_nz */
/* member: num_cols */
/* member: objective_value */

/* attribute: __infeas_tol */

/* attribute: __max_mip_gap */
/* attribute: __seed */

/* attribute: __start */
/* attribute: __plog */
/* attribute: __opt_tol */



/* attribute: __cuts_generator */





/* attribute: _status */

/* attribute: solver_name */
}
def maximize(objective : /* Union[mip.entities.LinExpr, mip.entities.Var] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("maximize")(objective).as[me.shadaj.scalapy.mip.entities.LinExpr]
def compute_features(model : me.shadaj.scalapy.mip.model.Model): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.float] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("compute_features")(model).as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.float]]
def read_custom_settings(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("read_custom_settings")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
def xsum(terms : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("xsum")(terms).as[me.shadaj.scalapy.mip.entities.LinExpr]
def save_mipstart(sol : me.shadaj.scalapy.stdlib.list[/* Tuple[mip.entities.Var, numbers.Real] */ me.shadaj.scalapy.py.Any], file_name : me.shadaj.scalapy.stdlib.str, obj : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("save_mipstart")(sol, file_name, obj).as[me.shadaj.scalapy.py.Any]
def minimize(objective : /* Union[mip.entities.LinExpr, mip.entities.Var] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("minimize")(objective).as[me.shadaj.scalapy.mip.entities.LinExpr]
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
def load_mipstart(file_name : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.stdlib.list[/* Tuple[builtins.str, numbers.Real] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("load_mipstart")(file_name).as[me.shadaj.scalapy.stdlib.list[/* Tuple[builtins.str, numbers.Real] */ me.shadaj.scalapy.py.Any]]
}
