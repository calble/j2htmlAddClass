package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAsync<T extends Tag<T>> extends IInstance<T>  {
default T isAsync() {self().attr("async");
return self();
}
default T withCondAsync(final boolean enable) {if (enable){
self().attr("async");
}
return self();
}
}
