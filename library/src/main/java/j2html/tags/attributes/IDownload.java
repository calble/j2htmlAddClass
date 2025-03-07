package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IDownload<T extends Tag<T>> extends IInstance<T>  {
default T isDownload() {self().attr("download");
return self();
}
default T withCondDownload(final boolean enable) {if (enable){
self().attr("download");
}
return self();
}
}
