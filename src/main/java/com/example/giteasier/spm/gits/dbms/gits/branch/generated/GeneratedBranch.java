package com.example.giteasier.spm.gits.dbms.gits.branch.generated;

import com.example.giteasier.spm.gits.dbms.gits.branch.Branch;
import com.example.giteasier.spm.gits.dbms.gits.repository.Repository;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.BooleanField;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.LongForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import com.speedment.runtime.typemapper.bytes.ByteZeroOneToBooleanMapper;
import com.speedment.runtime.typemapper.time.TimestampToLocalDateTimeMapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * The generated base for the {@link
 * com.example.giteasier.spm.gits.dbms.gits.branch.Branch}-interface
 * representing entities of the {@code branch}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedBranch {
    
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getId()} method.
     */
    LongField<Branch, Long> ID = LongField.create(
        Identifier.ID,
        Branch::getId,
        Branch::setId,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getProjectId()} method.
     */
    LongForeignKeyField<Branch, Long, Repository> PROJECT_ID = LongForeignKeyField.create(
        Identifier.PROJECT_ID,
        Branch::getProjectId,
        Branch::setProjectId,
        Repository.ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getName()} method.
     */
    StringField<Branch, String> NAME = StringField.create(
        Identifier.NAME,
        Branch::getName,
        Branch::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getChash()} method.
     */
    StringField<Branch, String> CHASH = StringField.create(
        Identifier.CHASH,
        Branch::getChash,
        Branch::setChash,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getTag()} method.
     */
    StringField<Branch, String> TAG = StringField.create(
        Identifier.TAG,
        Branch::getTag,
        Branch::setTag,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getMessage()} method.
     */
    StringField<Branch, String> MESSAGE = StringField.create(
        Identifier.MESSAGE,
        Branch::getMessage,
        Branch::setMessage,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getCreationTime()} method.
     */
    ComparableField<Branch, Timestamp, LocalDateTime> CREATION_TIME = ComparableField.create(
        Identifier.CREATION_TIME,
        Branch::getCreationTime,
        Branch::setCreationTime,
        new TimestampToLocalDateTimeMapper(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getUpdateTime()} method.
     */
    ComparableField<Branch, Timestamp, LocalDateTime> UPDATE_TIME = ComparableField.create(
        Identifier.UPDATE_TIME,
        Branch::getUpdateTime,
        Branch::setUpdateTime,
        new TimestampToLocalDateTimeMapper(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getDeleted()} method.
     */
    BooleanField<Branch, Byte> DELETED = BooleanField.create(
        Identifier.DELETED,
        Branch::getDeleted,
        Branch::setDeleted,
        new ByteZeroOneToBooleanMapper(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getBase()} method.
     */
    StringField<Branch, String> BASE = StringField.create(
        Identifier.BASE,
        Branch::getBase,
        Branch::setBase,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Branch} field that can be obtained
     * using the {@link Branch#getBaseline()} method.
     */
    ComparableField<Branch, Timestamp, LocalDateTime> BASELINE = ComparableField.create(
        Identifier.BASELINE,
        Branch::getBaseline,
        Branch::setBaseline,
        new TimestampToLocalDateTimeMapper(),
        false
    );
    
    /**
     * Returns the id of this Branch. The id field corresponds to the database
     * column gits.gits.branch.id.
     * 
     * @return the id of this Branch
     */
    long getId();
    
    /**
     * Returns the projectId of this Branch. The projectId field corresponds to
     * the database column gits.gits.branch.project_id.
     * 
     * @return the projectId of this Branch
     */
    long getProjectId();
    
    /**
     * Returns the name of this Branch. The name field corresponds to the
     * database column gits.gits.branch.name.
     * 
     * @return the name of this Branch
     */
    String getName();
    
    /**
     * Returns the chash of this Branch. The chash field corresponds to the
     * database column gits.gits.branch.chash.
     * 
     * @return the chash of this Branch
     */
    String getChash();
    
    /**
     * Returns the tag of this Branch. The tag field corresponds to the database
     * column gits.gits.branch.tag.
     * 
     * @return the tag of this Branch
     */
    String getTag();
    
    /**
     * Returns the message of this Branch. The message field corresponds to the
     * database column gits.gits.branch.message.
     * 
     * @return the message of this Branch
     */
    String getMessage();
    
    /**
     * Returns the creationTime of this Branch. The creationTime field
     * corresponds to the database column gits.gits.branch.creation_time.
     * 
     * @return the creationTime of this Branch
     */
    LocalDateTime getCreationTime();
    
    /**
     * Returns the updateTime of this Branch. The updateTime field corresponds
     * to the database column gits.gits.branch.update_time.
     * 
     * @return the updateTime of this Branch
     */
    LocalDateTime getUpdateTime();
    
    /**
     * Returns the deleted of this Branch. The deleted field corresponds to the
     * database column gits.gits.branch.deleted.
     * 
     * @return the deleted of this Branch
     */
    boolean getDeleted();
    
    /**
     * Returns the base of this Branch. The base field corresponds to the
     * database column gits.gits.branch.base.
     * 
     * @return the base of this Branch
     */
    String getBase();
    
    /**
     * Returns the baseline of this Branch. The baseline field corresponds to
     * the database column gits.gits.branch.baseline.
     * 
     * @return the baseline of this Branch
     */
    LocalDateTime getBaseline();
    
    /**
     * Sets the id of this Branch. The id field corresponds to the database
     * column gits.gits.branch.id.
     * 
     * @param id to set of this Branch
     * @return   this Branch instance
     */
    Branch setId(long id);
    
    /**
     * Sets the projectId of this Branch. The projectId field corresponds to the
     * database column gits.gits.branch.project_id.
     * 
     * @param projectId to set of this Branch
     * @return          this Branch instance
     */
    Branch setProjectId(long projectId);
    
    /**
     * Sets the name of this Branch. The name field corresponds to the database
     * column gits.gits.branch.name.
     * 
     * @param name to set of this Branch
     * @return     this Branch instance
     */
    Branch setName(String name);
    
    /**
     * Sets the chash of this Branch. The chash field corresponds to the
     * database column gits.gits.branch.chash.
     * 
     * @param chash to set of this Branch
     * @return      this Branch instance
     */
    Branch setChash(String chash);
    
    /**
     * Sets the tag of this Branch. The tag field corresponds to the database
     * column gits.gits.branch.tag.
     * 
     * @param tag to set of this Branch
     * @return    this Branch instance
     */
    Branch setTag(String tag);
    
    /**
     * Sets the message of this Branch. The message field corresponds to the
     * database column gits.gits.branch.message.
     * 
     * @param message to set of this Branch
     * @return        this Branch instance
     */
    Branch setMessage(String message);
    
    /**
     * Sets the creationTime of this Branch. The creationTime field corresponds
     * to the database column gits.gits.branch.creation_time.
     * 
     * @param creationTime to set of this Branch
     * @return             this Branch instance
     */
    Branch setCreationTime(LocalDateTime creationTime);
    
    /**
     * Sets the updateTime of this Branch. The updateTime field corresponds to
     * the database column gits.gits.branch.update_time.
     * 
     * @param updateTime to set of this Branch
     * @return           this Branch instance
     */
    Branch setUpdateTime(LocalDateTime updateTime);
    
    /**
     * Sets the deleted of this Branch. The deleted field corresponds to the
     * database column gits.gits.branch.deleted.
     * 
     * @param deleted to set of this Branch
     * @return        this Branch instance
     */
    Branch setDeleted(boolean deleted);
    
    /**
     * Sets the base of this Branch. The base field corresponds to the database
     * column gits.gits.branch.base.
     * 
     * @param base to set of this Branch
     * @return     this Branch instance
     */
    Branch setBase(String base);
    
    /**
     * Sets the baseline of this Branch. The baseline field corresponds to the
     * database column gits.gits.branch.baseline.
     * 
     * @param baseline to set of this Branch
     * @return         this Branch instance
     */
    Branch setBaseline(LocalDateTime baseline);
    
    /**
     * Queries the specified manager for the referenced Repository. If no such
     * Repository exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Repository findProjectId(Manager<Repository> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Branch> {
        
        ID            ("id"),
        PROJECT_ID    ("project_id"),
        NAME          ("name"),
        CHASH         ("chash"),
        TAG           ("tag"),
        MESSAGE       ("message"),
        CREATION_TIME ("creation_time"),
        UPDATE_TIME   ("update_time"),
        DELETED       ("deleted"),
        BASE          ("base"),
        BASELINE      ("baseline");
        
        private final String columnId;
        private final TableIdentifier<Branch> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "gits";
        }
        
        @Override
        public String getSchemaId() {
            return "gits";
        }
        
        @Override
        public String getTableId() {
            return "branch";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Branch> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}