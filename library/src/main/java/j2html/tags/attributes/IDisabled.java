package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IDisabled<T extends Tag<T>> extends IInstance<T>  {
default T isDisabled() {self().attr("disabled");
return self();
}
default T withCondDisabled(final boolean enable) {if (enable){
self().attr("disabled");
}
return self();
}
}
