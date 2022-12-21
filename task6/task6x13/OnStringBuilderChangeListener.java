package task6x13;

/**
 * Слушатель.
 * Каждый раз, когда меняется связанный с ним UndobleStringBuilder,
 * вызывается метод onChange().
 */
interface OnStringBuilderChangeListener {
    void onChange(OvservableStringBuilder stringBuilder);
}
