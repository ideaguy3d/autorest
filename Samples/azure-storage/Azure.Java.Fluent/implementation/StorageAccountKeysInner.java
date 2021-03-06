/**
 */

package petstore.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The access keys for the storage account.
 */
public class StorageAccountKeysInner {
    /**
     * Gets the value of key 1.
     */
    @JsonProperty(value = "key1")
    private String key1;

    /**
     * Gets the value of key 2.
     */
    @JsonProperty(value = "key2")
    private String key2;

    /**
     * Get the key1 value.
     *
     * @return the key1 value
     */
    public String key1() {
        return this.key1;
    }

    /**
     * Set the key1 value.
     *
     * @param key1 the key1 value to set
     * @return the StorageAccountKeysInner object itself.
     */
    public StorageAccountKeysInner withKey1(String key1) {
        this.key1 = key1;
        return this;
    }

    /**
     * Get the key2 value.
     *
     * @return the key2 value
     */
    public String key2() {
        return this.key2;
    }

    /**
     * Set the key2 value.
     *
     * @param key2 the key2 value to set
     * @return the StorageAccountKeysInner object itself.
     */
    public StorageAccountKeysInner withKey2(String key2) {
        this.key2 = key2;
        return this;
    }

}
